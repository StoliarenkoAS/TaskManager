package tm.server.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CypherUtil {

    @NotNull
    public static String getMd5(@NotNull final String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "corrupted-hash";
        }
    }

    @Nullable
    public static String sign(
            @Nullable final Object value,
            @Nullable final String salt,
            @Nullable final Integer cycle
    ) {
        try {
            @NotNull final ObjectMapper objectMapper = new ObjectMapper();
            @NotNull final String json = objectMapper.writeValueAsString(value);
            return sign(json, salt, cycle);
        } catch (final JsonProcessingException e) {
            return null;
        }
    }

    @Nullable
    public static String sign(
            @Nullable final String value,
            @Nullable final String salt,
            @Nullable final Integer cycle
    ) {
        if (value == null || salt == null || cycle == null) return null;
        @Nullable String result = value;
        for (int i = 0; i < cycle; i++) {
            result = getMd5(salt + result + salt);
        }
        return result;
    }

}
