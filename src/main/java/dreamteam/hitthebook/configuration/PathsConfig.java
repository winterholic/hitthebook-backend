package dreamteam.hitthebook.configuration;

import java.util.Arrays;

public class PathsConfig {
    public static final String[] SWAGGER_WHITELIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/webjars/**",
            "/swagger-resources/**"
    };

    public static final String[] PUBLIC_WHITELIST = {
            "/",
            "/login",
            "/temp/token",
            "/mail/authorization/**"
    };

    public static final String[] CORS_WHITELIST = {
            "http://localhost:3000",
            "https://localhost:3000",
            "http://localhost:8080",
            "https://localhost:8080"
    };

    public static final String[] ALL_WHITELIST = mergePaths(SWAGGER_WHITELIST, PUBLIC_WHITELIST);

    private static String[] mergePaths(String[]... paths) {
        return Arrays.stream(paths)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }
}

