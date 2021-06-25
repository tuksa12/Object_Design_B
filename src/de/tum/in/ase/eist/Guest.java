package de.tum.in.ase.eist;

public class Guest {

    private BiergartenRegistrationForm biergartenRegistrationForm = new BiergartenRegistrationForm();
    private Phone phone;

    public Guest(Phone smartphone) {
        this.phone = smartphone;
    }

    /**
     * Provides information about this guest depending on the configured registration strategy.
     *
     * @return GuestEntry containing information about this guest
     */
    public GuestEntry fillOutForm() {
        GuestEntry filledOutForm = biergartenRegistrationForm.registerGuest(this);
        System.out.println("I have filled out the form: " + filledOutForm);
        return filledOutForm;
    }

    public BiergartenRegistrationForm getBiergartenRegistrationForm() {
        return biergartenRegistrationForm;
    }

    public void setBiergartenRegistrationForm(BiergartenRegistrationForm biergartenRegistrationForm) {
        this.biergartenRegistrationForm = biergartenRegistrationForm;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
