package tm.client.api.repository;

import org.jetbrains.annotations.NotNull;
import tm.client.entity.Task;

import java.util.Collection;

public interface TaskRepository extends PlannedEntityRepository<Task> {

    @NotNull
    Collection<Task> findByProjectId(@NotNull String userId, @NotNull String projectId);


}