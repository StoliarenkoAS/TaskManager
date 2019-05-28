package tm.client.api.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm.client.entity.User;

import java.util.Optional;

public interface UserService extends Service<User> {

    @NotNull
    Optional<User> validate(@Nullable String name, @Nullable String pwdHash);

    void persist(@Nullable User user);

}