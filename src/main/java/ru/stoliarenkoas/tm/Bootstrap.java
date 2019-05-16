package ru.stoliarenkoas.tm;

import ru.stoliarenkoas.tm.console.ConsoleCommands;
import ru.stoliarenkoas.tm.console.ConsoleHelper;
import ru.stoliarenkoas.tm.console.InputHelper;

import java.io.IOException;

public class Bootstrap {

    public static void init() {
        final ConsoleHelper consoleHelper = new ConsoleHelper();

        System.out.println("*** WELCOME TO TASK-MANAGER ***");
        try {
            String inputLine;
            MainCycle:
            while ((inputLine = InputHelper.requestLine("enter command", true)) != null) {
                ConsoleCommands command;
                try {
                    command = ConsoleCommands.valueOf(inputLine.toUpperCase().replace('-', '_'));
                    switch (command) {
                        case EXIT: { break MainCycle; }
                        case HELP: {
                            InputHelper.printHelp();
                            continue;
                        }
                        //region ProjectCommands
                        case PROJECT_CREATE: {
                            consoleHelper.createProject();
                            continue;
                        }
                        case PROJECT_REMOVE: {
                            consoleHelper.removeProject();
                            continue;
                        }
                        case PROJECT_LIST: {
                            consoleHelper.showProjects();
                            continue;
                        }
                        case PROJECT_TASK_LIST: {
                            consoleHelper.showProjectTasks();
                            continue;
                        }
                        case PROJECT_CLEAR: {
                            consoleHelper.clearProjects();
                            continue;
                        }
                        //endregion
                        //region TaskCommands
                        case TASK_CREATE: {
                            consoleHelper.createTask();
                            continue;
                        }
                        case TASK_REMOVE: {
                            consoleHelper.removeTask();
                            continue;
                        }
                        case TASK_LIST: {
                            consoleHelper.showTasks();
                            continue;
                        }
                        case TASK_CLEAR: {
                            consoleHelper.clearTasks();
                            continue;
                        }
                        //endregion
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("INVALID COMMAND, TYPE EXIT TO END PROGRAM");
                    System.out.println();
                    continue;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}