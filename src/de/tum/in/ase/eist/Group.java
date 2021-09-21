package de.tum.in.ase.eist;

public class Group {

    private final PasswordAuthentication passwordAuthentication;

    public Group() {
        this.passwordAuthentication = new PasswordAuthentication();
    }

    public boolean checkLogin(String loginName, LoginRequest request) {
        return passwordAuthentication.authenticate(loginName, request);
    }
}
