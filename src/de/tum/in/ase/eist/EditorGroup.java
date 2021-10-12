package de.tum.in.ase.eist;

import java.util.Map;

public class EditorGroup extends Group{
    private final OAuthAuthentication oAuthAuthentication;

    public EditorGroup() {
        this.oAuthAuthentication = new OAuthAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return oAuthAuthentication.login(loginName, request);
    }
}
