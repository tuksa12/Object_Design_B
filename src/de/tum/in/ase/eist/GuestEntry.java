package de.tum.in.ase.eist;

import java.time.LocalDateTime;

public class GuestEntry {

    private final LocalDateTime arrival;
    private String name;
    private String address;
    private String token;

    public GuestEntry(LocalDateTime arrival, String name, String address) {
        this.arrival = arrival;
        this.name = name;
        this.address = address;
    }

    public GuestEntry(String token) {
        arrival = LocalDateTime.now();
        this.token = token;
    }

    @Override
    public String toString() {
        return "Arrival: %s, %s".formatted(arrival, getContactDetails());
    }

    /**
     * Provides the contact details of a guest as a token if they register via the AntiCovidApp,
     * otherwise as name and address.
     *
     * @return contact details of a guest as String
     */
    public String getContactDetails() {
        if (token == null) {
            return "name: %s, address: %s".formatted(name, address);
        }
        return "token: " + token;
    }

}
