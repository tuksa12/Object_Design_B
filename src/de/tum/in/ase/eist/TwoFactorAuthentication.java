package de.tum.in.ase.eist;

import java.util.Map;

public class TwoFactorAuthentication implements AuthenticationMethod{
    private final OAuthAuthentication oAuthAuthentication;
    private final TokenBasedAuthentication tokenBasedAuthentication;

    public TwoFactorAuthentication() {
        oAuthAuthentication = new OAuthAuthentication();
        tokenBasedAuthentication = new TokenBasedAuthentication();
    }

    public boolean login(String loginName, Map<LoginRequestType, String> loginRequest) {
        if (oAuthAuthentication.login(loginName,loginRequest)) {
            return tokenBasedAuthentication.login(loginName);
        }
        return false;
    }
}
