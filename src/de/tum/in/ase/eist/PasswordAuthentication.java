package de.tum.in.ase.eist;

import java.util.Map;

public class PasswordAuthentication {

    public boolean authenticate(String loginName, Map<LoginRequestType, String> loginRequest) {
        String password = loginRequest.get(LoginRequestType.PASSWORD);
        System.out.println("Logging in " + loginName);
        if (password == null || password.isEmpty()) {
            System.out.println(">> Failure!");
            System.out.println();
            return false;
        }
        System.out.println("Hashing the password and checking the database...");
        System.out.println(">> Success!");
        System.out.println();
        return true;
    }
}
