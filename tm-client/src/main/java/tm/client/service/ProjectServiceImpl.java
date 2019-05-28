package tm.client.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm.client.api.ServiceLocator;
import tm.client.api.repository.PlannedEntityRepository;
import tm.client.api.service.ProjectService;
import tm.client.api.service.Service;
import tm.client.comparator.ComparatorType;
import tm.client.entity.Project;
import tm.client.entity.Task;

import java.util.Collection;
import java.util.Collections;

public class ProjectServiceImpl extends AbstractService<Project> implements ProjectService {

    public ProjectServiceImpl(@NotNull final PlannedEntityRepository<Project> repository, @NotNull final ServiceLocator serviceLocator) {
        super(repository, serviceLocator);
    }

    @Override
    public void deleteChildrenByParentId(@Nullable final String id) {
        final Service<Task> childService = serviceLocator.getTaskService();
        childService.deleteByIds(Collections.singletonList(id));
    }

    @Override
    public void deleteChildrenByParentIds(@Nullable final Collection<String> ids) {
        final Service<Task> childService = serviceLocator.getTaskService();
        childService.deleteByIds(ids);
    }

    @Override @NotNull
    public Collection<Project> search(@Nullable final String searchLine) {
        final String userId = getCurrentUserId();
        if (userId == null || searchLine == null || searchLine.isEmpty()) return Collections.emptySet();
        return ((PlannedEntityRepository<Project>)repository).search(userId, searchLine);
    }

    @Override @NotNull
    public Collection<Project> getAllSorted(@Nullable final ComparatorType comparatorType) {
        final String userId = getCurrentUserId();
        if (userId == null) return Collections.emptySet();
        if (comparatorType == null) return getAll();
        return ((PlannedEntityRepository<Project>)repository).findAllAndSort(userId, comparatorType);
    }

    @Override @NotNull
    public Collection<Project> getAllByNameSorted(@Nullable final String name, @Nullable final ComparatorType comparatorType) {
        final String userId = getCurrentUserId();
        if (userId == null || name == null) return Collections.emptySet();
        if (comparatorType == null) return getAllByName(name);
        return ((PlannedEntityRepository<Project>)repository).findByNameAndSort(userId, comparatorType, name);
    }

}