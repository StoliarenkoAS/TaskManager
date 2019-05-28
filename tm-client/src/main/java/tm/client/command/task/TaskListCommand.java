package tm.client.command.task;

import org.jetbrains.annotations.NotNull;
import tm.client.command.AbstractCommand;
import tm.client.entity.Task;

import java.io.IOException;
import java.util.Collection;

public class TaskListCommand extends AbstractCommand {

    @NotNull public static final String NAME = "task-list";
    @NotNull private static final String DESCRIPTION = "show all tasks for all projects of a user";

    @Override @NotNull
    public String getName() { return NAME; }

    @Override @NotNull
    public String getDescription() { return DESCRIPTION; }

    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public void run() throws IOException {
        final Collection<Task> allTasks = getServiceLocator().getTaskService().getAll();
        if (allTasks.isEmpty()) {
            System.out.println("[TASK LIST IS EMPTY]");
            System.out.println();
            return;
        }
        System.out.println("TASK LIST");
        int index = 1;
        for (final Task task : allTasks) {
            System.out.printf("%d. %s %n", index++, task);
        }
        System.out.println();
    }

}