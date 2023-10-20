package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().openContactPage();
        app.contacts().createContact(new ContactData("first name", "last name"));
    }

    @Test
    public void canCreateContactWithEmptyName() {
        app.contacts().openContactPage();
        app.contacts().createContact(new ContactData());
    }

    @Test
    public void canCreateContactWithEmptyOnly() {
        app.contacts().openContactPage();
        var emptyContact = new ContactData();
        var contactWithName = emptyContact.withName("some name");
        app.contacts().createContact(contactWithName);
    }
}
