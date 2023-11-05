package model;

public record ContactData(String name, String lastName) {

    public ContactData() {
        this("", "");
    }

    public ContactData withName(String name) {
        return new ContactData(name, this.lastName);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.name, lastName);
    }

}
