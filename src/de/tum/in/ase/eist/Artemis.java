package de.tum.in.ase.eist;

import java.util.Map;

public class Artemis {

    // TODO add configuration and use specialized groups

    public static final Group administratorGroup = new Group();
    public static final Group instructorGroup = new Group();
    public static final Group studentGroup = new Group();

    public static void main(String[] args) {
        User chris = new User("chris", studentGroup);
        chris.login(Map.of(LoginRequestType.PASSWORD, "asdf123456"));

        User lana = new User("lana", instructorGroup);
        lana.login(Map.of(LoginRequestType.PASSWORD, "asdf123456"));

        User elena = new User("elena", administratorGroup);
        elena.login(Map.of(LoginRequestType.SIGNATURE, "384bnhdskj38fhsk38hfksdj38fhsdjkf38shal8aldjf38ahadjfl3a87f"));
    }
}
