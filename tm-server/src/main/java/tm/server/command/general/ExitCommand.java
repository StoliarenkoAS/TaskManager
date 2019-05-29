package tm.server.command.general;

import org.jetbrains.annotations.NotNull;
import tm.server.command.AbstractCommand;

import javax.xml.ws.Endpoint;

public class ExitCommand extends AbstractCommand {

    @NotNull public static final String NAME = "exit";
    @NotNull private static final String DESCRIPTION = "end program";

    @Override @NotNull
    public String getName() { return NAME; }

    @Override @NotNull
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPrivate() {
        return false;
    }

    @Override
    public void run() {
        getServiceLocator().getEndpoints().forEach(Endpoint::stop);
        System.out.println("[ENDPOINTS STOPPED]");
        getServiceLocator().terminate();
        System.out.println("[SERVER TERMINATED]");
    }

}
