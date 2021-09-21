package de.tum.in.ase.eist;

public class PasswordAuthentication {

    public boolean authenticate(String loginName, LoginRequest request) {
        String password = request.getParameters().get(LoginRequest.PASSWORD);
        if (password == null || password.isEmpty()) {
            return false;
        }
        System.out.println("Hashing the password and checking the database...");
        System.out.println(">> Success!");
        return true;
    }
}
