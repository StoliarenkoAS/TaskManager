package ru.stoliarenkoas.tm.command;

import ru.stoliarenkoas.tm.Bootstrap;

import java.io.IOException;

public class ProjectClearCommand extends Command {

    public static final String NAME = "project-clear";
    private static final String DESCRIPTION = "remove all projects";

    public ProjectClearCommand(final Bootstrap bootstrap) {
        super(bootstrap, NAME, DESCRIPTION);
    }

    @Override
    public void execute() throws IOException {
        getBootstrap().getProjectService().deleteAll();
        System.out.println("[ALL PROJECTS REMOVED]");
        System.out.println();
    }

}
