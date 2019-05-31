package tm.client.command.user;

import org.jetbrains.annotations.NotNull;
import tm.client.command.AbstractCommand;
import tm.common.entity.Session;

import java.io.IOException;

public class UserShowProfileCommand extends AbstractCommand {

    @NotNull public static final String NAME = "user-show-profile";
    @NotNull private static final String DESCRIPTION = "display profile of current user";

    @Override @NotNull
    public String getName() {
        return NAME;
    }

    @Override @NotNull
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public void run() throws IOException {
        final Session session = getServiceLocator().getCurrentSession();
        if (session == null) return;
        final String profile = getServiceLocator().getUserService().showProfile(session);
        System.out.println(profile);
        System.out.println();
    }

}
