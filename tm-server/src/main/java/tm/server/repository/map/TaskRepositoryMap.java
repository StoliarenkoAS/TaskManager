package tm.server.repository.map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm.common.entity.Task;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

public class TaskRepositoryMap extends AbstractRepositoryMap<Task> implements tm.server.api.repository.TaskRepository {

    @Override @NotNull
    public Collection<Task> findByProjectId(@NotNull final String userId, @NotNull final String projectId) {
        return findAll(userId).stream().filter(t -> projectId.equals(t.getProjectId())).collect(Collectors.toSet());
    }

    @Override
    public @NotNull Collection<String> removeByProjectIds(@NotNull Collection<String> ids) {
        final Collection<String> taskIds = new HashSet<>();
        ids.forEach(id -> map.values().stream().filter(t -> id.equals(t.getProjectId())).forEach(t -> taskIds.add(t.getId())));
        taskIds.forEach(map::remove);
        return taskIds;
    }

    @Override @NotNull
    public Collection<Task> search(@NotNull final String userId, @NotNull final String searchLine) {
        return findAll(userId).stream().filter(t ->
                Optional.ofNullable(t.getName()).orElse("").contains(searchLine) ||
                Optional.ofNullable(t.getDescription()).orElse("").contains(searchLine))
                .collect(Collectors.toSet());
    }
}