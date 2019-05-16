package ru.stoliarenkoas.tm.service;

import lombok.RequiredArgsConstructor;
import ru.stoliarenkoas.tm.api.ProjectRepository;
import ru.stoliarenkoas.tm.entity.Project;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Optional;

@RequiredArgsConstructor
public class ProjectService {

    private ProjectRepository repository;
    private TaskService taskService;

    public Collection<Project> getAllProjects() {
        return repository.findAll();
    }

    public Collection<Project> getAllByName(final String name) {
        if (name == null || name.isEmpty()) return Collections.EMPTY_SET;
        return repository.findByName(name);
    }

    public Collection<Project> getProjectsByIds(final Collection<String> ids) {
        if (ids == null || ids.isEmpty()) return Collections.EMPTY_SET;
        final Collection<Project> projects = new LinkedHashSet<>();
        ids.forEach(id -> Optional.of(this.getProject(id)).ifPresent(projects::add));
        return projects;
    }

    public Project getProject(final String id) {
        if (id == null || id.isEmpty()) return null;
        return repository.findOne(id);
    }

    public void saveProject(final Project project) {
        if (project == null || project.getId() == null || project.getId().isEmpty()) return;
        repository.merge(project);
    }

    public void deleteProject(final String id) {
        if (id == null || id.isEmpty()) return;

        repository.remove(id);
    }

    public void deleteProjectWithName(final String name, boolean allMatches) {
        if (name == null || name.isEmpty()) return;
        repository.removeByName(name, allMatches);
    }

    public void deleteAllProjects() {
        repository.removeAll();
    }

}
