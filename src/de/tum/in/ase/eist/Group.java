package de.tum.in.ase.eist;

import java.util.Map;

public class Group {

    private final OAuthAuthentication oAuthAuthentication;

    public Group() {
        this.oAuthAuthentication = new OAuthAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return oAuthAuthentication.login(loginName, request);
    }
}
