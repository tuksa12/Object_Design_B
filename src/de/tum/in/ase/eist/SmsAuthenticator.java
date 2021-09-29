package de.tum.in.ase.eist;

public class SmsAuthenticator {

    /*
     * DO NOT MODIFY THIS CLASS!
     */

    public boolean authenticate(String loginName) {
        System.out.println("Sending SMS to '" + loginName + "'...");
        if (loginName.hashCode() % 3 == 0) {
            System.out.println(">> Failure!");
            System.out.println();
            return false;
        }
        System.out.println(">> Success!");
        System.out.println();
        return true;
    }
}
