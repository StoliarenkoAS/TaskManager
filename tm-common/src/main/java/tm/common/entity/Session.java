package tm.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm.common.comparator.ComparatorType;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class Session {

    @NotNull private String id = UUID.randomUUID().toString();
    @NotNull private String userId = "";
    @NotNull private String userLogin = "";
    @NotNull private Date creationDate = new Date();
    @NotNull private ComparatorType sortMethod = ComparatorType.BY_CREATION_DATE;
    private String hash;

    public Session(@NotNull final String userId, @NotNull final String userLogin) {
        this.userId = userId;
        this.userLogin = userLogin;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", creationDate=" + creationDate +
                ", sortMethod=" + sortMethod +
                '}';
    }

}