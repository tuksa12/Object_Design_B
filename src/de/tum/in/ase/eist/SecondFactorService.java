package de.tum.in.ase.eist;

public class SecondFactorService {

    /*
     * DO NOT MODIFY THIS CLASS!
     */

    public boolean authenticate(String loginName) {
        System.out.println("Sending second factor request to '" + loginName + "'...");
        if (loginName.hashCode() % 3 == 0) {
            return false;
        }
        System.out.println(">> Success!");
        return true;
    }
}
