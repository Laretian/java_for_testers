package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.openContactPage();
        app.createContact(new ContactData("first name", "last name"));
    }

    @Test
    public void canCreateContactWithEmptyName() {
        app.openContactPage();
        app.createContact(new ContactData());
    }

    @Test
    public void canCreateContactWithEmptyOnly() {
        app.openContactPage();
        var emptyContact = new ContactData();
        var contactWithName = emptyContact.withName("some name");
        app.createContact(contactWithName);
    }
}
