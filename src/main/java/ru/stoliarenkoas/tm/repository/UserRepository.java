package ru.stoliarenkoas.tm.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.stoliarenkoas.tm.api.repository.UserRepository;
import ru.stoliarenkoas.tm.entity.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserRepository implements ru.stoliarenkoas.tm.api.repository.UserRepository {

    private @NotNull final Map<String, User> map = new LinkedHashMap<>();

  @NotNull
    public Optional<User> validate(@NotNull final String login, @NotNull final String pwdHash) {
        return map.values().stream()
                .filter(u -> login.equals(u.getLogin()) && pwdHash.equals(u.getPasswordHash()))
                .findAny();
    }

    @Override @NotNull
    public Collection<User> findAll(@NotNull final String userId) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return Collections.emptySet();
        return map.values();
    }

    @Override @NotNull
    public Collection<User> findByName(@NotNull final String userId, @NotNull final String name) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return Collections.emptySet();
        return findAll(userId).stream().filter(u -> name.equals(u.getLogin())).collect(Collectors.toSet());
    }

    @Override
    public User findOne(@NotNull final String userId, @NotNull final String id) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return null;
        return user;
    }

    @Override
    public void persist(@NotNull final User user) {
        map.putIfAbsent(user.getId(), user);
    }

    @Override
    public void merge(@NotNull final String userId, @NotNull final User user) {
        final User currentUser = map.get(userId);
        if (currentUser == null || currentUser.getRole() != User.Role.ADMIN) return;
        map.put(user.getId(), user);
    }

    @Override @Nullable
    public String remove(@NotNull final String userId, @NotNull final String id) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return null;
        map.remove(id);
        return id;
    }

    @Override @Nullable
    public String remove(@NotNull final String userId, @NotNull final User user) {
        final User currentUser = map.get(userId);
        if (currentUser == null || currentUser.getRole() != User.Role.ADMIN) return null;
        map.remove(user.getId());
        return user.getId();
    }

    @Override @NotNull
    public Collection<String> removeByName(@NotNull final String userId, @NotNull final String name) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return Collections.emptySet();
        final Collection<String> ids =  map.values().stream()
                .filter(u -> name.equals(u.getName())).map(User::getName).collect(Collectors.toSet());
        ids.forEach(id -> {if (map.remove(id)==null) ids.remove(id);});
        return ids;
    }

    @Override @NotNull
    public Collection<String> removeAll(@NotNull final String userId) {
        final User user = map.get(userId);
        if (user == null || user.getRole() != User.Role.ADMIN) return Collections.emptySet();
        final Collection<String> ids = map.keySet();
        map.clear();
        return ids;
    }

}