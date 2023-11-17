package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactModificationTest extends TestBase {

    @Test
    void canModifyContact() {
        if (app.contacts().getCount() == 0) {
            app.contacts().createContact(new ContactData("", "name", "lastName"));
        }
        app.contacts().modifyContact(new ContactData().withName("modified name"));
    }

}
