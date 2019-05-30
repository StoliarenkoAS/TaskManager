package tm.server.command.user;

import org.jetbrains.annotations.NotNull;
import tm.server.command.AbstractCommand;
import tm.common.entity.User;

import java.io.IOException;

public class UserShowProfileCommand extends AbstractCommand {

    @NotNull public static final String NAME = "user-show-profile";
    @NotNull private static final String DESCRIPTION = "display profile of current user";

    @NotNull
    @Override
    public String getName() {
        return NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public void run() throws IOException {
        final String userProfile = getServiceLocator().getUserService().showUserProfile();
        System.out.println(userProfile);
    }

}
