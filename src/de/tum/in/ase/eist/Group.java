package de.tum.in.ase.eist;

import java.util.Map;

public abstract class Group {

    public Group() {
    }

    public abstract boolean checkLogin(String loginName, Map<LoginRequestType, String> request);
}
