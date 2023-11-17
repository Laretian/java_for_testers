package model;

public record ContactData(String id, String name, String lastName) {

    public ContactData() {
        this("", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData(id, this.name, this.lastName);
    }
    public ContactData withName(String name) {
        return new ContactData(this.id, name, this.lastName);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.id, this.name, lastName);
    }

}
