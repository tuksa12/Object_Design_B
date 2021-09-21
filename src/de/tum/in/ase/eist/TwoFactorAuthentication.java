package de.tum.in.ase.eist;

public class TwoFactorAuthentication {

    private PasswordAuthentication passwordAuthentication = new PasswordAuthentication();

    public boolean authenticate(String loginName, LoginRequest request) {
        boolean passwordCorrect = passwordAuthentication.authenticate(loginName, request);
        if (!passwordCorrect) {
            return false;
        }
        System.out.println("Sending second factor request...");
        System.out.println(">> Success!");
        return true;
    }

}