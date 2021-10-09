package de.tum.in.ase.eist;

import java.util.Map;

public class GoogleAuthentication {

    public boolean login(String loginName, Map<LoginRequestType, String> loginRequest) {
        String token = loginRequest.get(LoginRequestType.TOKEN);
        System.out.println("Logging in " + loginName);
        if (token == null || token.isEmpty()) {
            System.out.println(">> Failure!");
            System.out.println();
            return false;
        }
        System.out.println("Checking the provided token...");
        System.out.println(">> Success!");
        System.out.println();
        return true;
    }
}
