package de.tum.in.ase.eist;

import java.util.Map;

public class Group {

    private final PasswordAuthentication passwordAuthentication;

    public Group() {
        this.passwordAuthentication = new PasswordAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return passwordAuthentication.authenticate(loginName, request);
    }
}
