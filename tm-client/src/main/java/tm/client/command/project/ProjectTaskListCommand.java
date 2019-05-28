package tm.client.command.project;

import org.jetbrains.annotations.NotNull;
import tm.client.api.service.TaskService;
import tm.client.command.AbstractCommand;
import tm.client.entity.Project;
import tm.client.entity.Task;
import tm.client.utils.InputHelper;

import java.io.IOException;
import java.util.Collection;
import java.util.TreeSet;

public class ProjectTaskListCommand extends AbstractCommand {

    @NotNull public static final String NAME = "project-task-list";
    @NotNull private static final String DESCRIPTION = "show all tasks for selected project";

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
        final Collection<Project> projects = InputHelper.requestProjectsByName(getServiceLocator());
        if (projects == null) return;
        final Collection<Task> tasks = new TreeSet<>(getServiceLocator().getCurrentSortMethod());
        for (final Project project : projects) {
            tasks.addAll(((TaskService)(getServiceLocator().getTaskService())).getTasksByProjectId(project.getId()));
        }
        if (tasks.isEmpty()) {
            System.out.println("[PROJECT HAS NO TASKS]");
            System.out.println();
            return;
        }
        int index = 1;
        for (final Task task : tasks) {
            System.out.printf("%d. %s.%n", index, task);
        }
    }

}