package de.tum.in.ase.eist;

import java.util.Map;

public class CertificateAuthentication {

    public boolean authenticate(String loginName, Map<LoginRequestType, String> loginRequest) {
        String signature = loginRequest.get(LoginRequestType.SIGNATURE);
        System.out.println("Logging in " + loginName);
        if (signature == null || signature.isBlank()) {
            System.out.println(">> Failure!");
            System.out.println();
            return false;
        }
        System.out.println("Checking if the signature is a valid of the stored certificate...");
        System.out.println(">> Success!");
        System.out.println();
        return true;
    }
}
