package de.tum.in.ase.eist;

import java.util.Map;

public class TutorsGroup extends Group{
    private final TwoFactorAuthentication twoFactorAuthentication;

    public TutorsGroup() {
        this.twoFactorAuthentication = new TwoFactorAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return twoFactorAuthentication.login(loginName, request);
    }
}
