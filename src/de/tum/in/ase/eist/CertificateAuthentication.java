package de.tum.in.ase.eist;

public class CertificateAuthentication {

    public boolean authenticate(String loginName, LoginRequest request) {
        String signature = request.getParameters().get(LoginRequest.SIGNATURE);
        if (signature == null || signature.isBlank()) {
            return false;
        }
        System.out.println("Checking if the signature is a valid of the stored certificate...");
        System.out.println(">> Success!");
        return true;
    }
}
