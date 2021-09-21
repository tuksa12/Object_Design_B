package de.tum.in.ase.eist;

import java.util.Map;

public class LoginRequest {

    public static final String PASSWORD = "password";
    public static final String SIGNATURE = "certificate-signature";

    private final Map<String, String> parameters;

    public LoginRequest(Map<String, String> parameters) {
        this.parameters = Map.copyOf(parameters);
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
