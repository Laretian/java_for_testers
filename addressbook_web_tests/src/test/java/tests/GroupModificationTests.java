package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    void canModifyGroup() {
        if (!app.isContactPresent()) {
            app.createContact(new ContactData("contact name", "contact last name"));
        }
        app.groups().modifyGroup(new GroupData().withName("modified name"));
    }

}
