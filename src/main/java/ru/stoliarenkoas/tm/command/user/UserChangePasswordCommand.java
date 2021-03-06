package ru.stoliarenkoas.tm.command.user;

import org.jetbrains.annotations.NotNull;
import ru.stoliarenkoas.tm.command.AbstractCommand;
import ru.stoliarenkoas.tm.console.InputHelper;
import ru.stoliarenkoas.tm.entity.User;

import java.io.IOException;

public class UserChangePasswordCommand extends AbstractCommand {

    @NotNull public static final String NAME = "user-change-password";
    @NotNull private static final String DESCRIPTION = "change password for current user";

    @NotNull
    @Override
    public String getName() { return NAME; }

    @NotNull
    @Override
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public void run() throws IOException {
        final User user = getServiceLocator().getCurrentUser();

        final String pwd = InputHelper.requestLine("ENTER OLD PASSWORD:", false);
        if (pwd == null) return;
        if (!user.getPwdHash().equals(InputHelper.getMd5(pwd))) {
            System.out.println("WRONG PASSWORD");
            System.out.println("[END]");
            System.out.println();
        }

        System.out.println("[SET UP NEW PASSWORD]");
        final String newPwd = InputHelper.requestNewPassword();
        if (newPwd == null) return;
        user.setPwdHash(InputHelper.getMd5(newPwd));
        getServiceLocator().getUserService().save(user);
        System.out.println("[PASSWORD UPDATED]");
        System.out.println();
    }

}
