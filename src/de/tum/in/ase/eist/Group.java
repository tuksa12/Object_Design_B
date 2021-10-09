package de.tum.in.ase.eist;

import java.util.Map;

public class Group {

    private final GoogleAuthentication googleAuthentication;

    public Group() {
        this.googleAuthentication = new GoogleAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return googleAuthentication.login(loginName, request);
    }
}
