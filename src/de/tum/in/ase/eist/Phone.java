package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class Phone {

    private final String modelNumber;
    private final String brand;
    private String phoneNumber;
    private boolean isAntiCovidAppInstalled;
    private final List<GuestEntry> guestEntries = new ArrayList<>();

    public Phone(String modelNumber, String brand, String phoneNumber, boolean isAntiCovidAppInstalled) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.phoneNumber = phoneNumber;
        this.isAntiCovidAppInstalled = isAntiCovidAppInstalled;
    }

    @Override
    public String toString() {
        return "Model Number: %s, Brand: %s, Phone Number: %s, is smart: %b".formatted(modelNumber, brand, phoneNumber, isAntiCovidAppInstalled);
    }

    public String getBrand() {
        return brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isAntiCovidAppInstalled() {
        return isAntiCovidAppInstalled;
    }

    public void setAntiCovidAppInstalled(boolean isAntiCovidAppInstalled) {
        this.isAntiCovidAppInstalled = isAntiCovidAppInstalled;
    }

    public List<GuestEntry> getGuestEntries() {
        return guestEntries;
    }

    public void addGuestEntry(GuestEntry guestEntry) {
        guestEntries.add(guestEntry);
    }

}
