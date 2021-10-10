package de.tum.in.ase.eist;

import java.util.Map;

public class Artemis {

    // TODO add configuration and use specialized groups

    public static final Group administratorGroup = new Group();
    public static final Group editorGroup = new Group();
    public static final Group tutorsGroup = new Group();

    public static void main(String[] args) {
        User chris = new User("chris", editorGroup);
        chris.login(Map.of(LoginRequestType.OAUTH_TOKEN, "asdf123456"));

        User lana = new User("lana", tutorsGroup);
        lana.login(Map.of(LoginRequestType.OAUTH_TOKEN, "asdf123456"));

        User elena = new User("elena", administratorGroup);
        elena.login(Map.of(LoginRequestType.SIGNATURE, "384bnhdskj38fhsk38hfksdj38fhsdjkf38shal8aldjf38ahadjfl3a87f"));
    }
}
