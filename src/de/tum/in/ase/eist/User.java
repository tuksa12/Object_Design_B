package de.tum.in.ase.eist;

public class User {

    private final String name;
    private final Group group;
    private String fullName;

    public User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public boolean login(LoginRequest request) {
        return group.checkLogin(name, request);
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}