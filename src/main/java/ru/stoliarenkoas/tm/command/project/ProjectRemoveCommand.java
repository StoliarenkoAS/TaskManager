package ru.stoliarenkoas.tm.command.project;

import org.jetbrains.annotations.NotNull;
import ru.stoliarenkoas.tm.command.AbstractCommand;
import ru.stoliarenkoas.tm.console.InputHelper;
import ru.stoliarenkoas.tm.entity.Project;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

public class ProjectRemoveCommand extends AbstractCommand {

    @NotNull public static final String NAME = "project-remove";
    @NotNull private static final String DESCRIPTION = "remove project and all associated tasks";

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
        System.out.println("[PROJECT DELETE]");
        final String projectName = InputHelper.requestLine("ENTER PROJECT NAME:", false);
        if (projectName == null) return;
        getServiceLocator().getProjectService().deleteByName(projectName);
        System.out.println("[PROJECT(S) DELETED]");
        System.out.println();
    }

}
