package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase{

    @Test
    public void canRemoveContact() {
        app.openContactPage();
        if (!app.isContactPresent()) {
            app.createContact(new ContactData("contact name", "contact last name"));
        }
        app.removeContact();
    }

}
