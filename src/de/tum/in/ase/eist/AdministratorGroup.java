package de.tum.in.ase.eist;

import java.util.Map;

public class AdministratorGroup extends Group{
    private final BiometricAuthentication biometricAuthentication;

    public AdministratorGroup() {
        this.biometricAuthentication = new BiometricAuthentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return biometricAuthentication.login(loginName, request);
    }
}
