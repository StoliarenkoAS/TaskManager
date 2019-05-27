package ru.stoliarenkoas.tm.api.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.stoliarenkoas.tm.api.entity.Entity;
import ru.stoliarenkoas.tm.entity.comparator.ComparatorType;

import java.util.Collection;

public interface Repository<T extends Entity> {

    @NotNull
    Collection<T> findAll(@NotNull String userId);

    @NotNull
    Collection<T> findByName(@NotNull String userId, @NotNull String name);

    T findOne(@NotNull String userId, @NotNull String id);

    void persist(T object);

    void merge(@NotNull String userId, T object);

    @Nullable
    String remove(@NotNull String userId, @NotNull String id);

    @Nullable
    String remove(@NotNull String userId, T object);

    @NotNull
    Collection<String> removeByName(@NotNull String userId, @NotNull String name);

    @NotNull
    Collection<String> removeAll(@NotNull String userId);
}
