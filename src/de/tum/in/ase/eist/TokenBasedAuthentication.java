package de.tum.in.ase.eist;

import java.util.Map;

public class TokenBasedAuthentication {

    /*
     * DO NOT MODIFY THIS CLASS!
     */

    public boolean login(String loginName) {
        System.out.println("Checking credentials by external identity provider '" + loginName + "'...");
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
