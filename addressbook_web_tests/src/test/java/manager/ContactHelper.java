package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openContactPage() {
        if (!manager.isElementPresent(By.name("new"))) {
            click(By.linkText("add new"));
        }
    }

    public void createContact(ContactData contact) {
        openContactPage();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }
    public void removeContact() {
        selectContact();
        removeSelectContact();
        confirmAction();
    }


    private void returnToHomePage() {
        click(By.linkText("home page"));
    }

    private void submitContactCreation() {
        click(By.name("submit"));
    }

    private void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.name());
        type(By.name("lastname"), contact.lastName());
    }

    private void removeSelectContact() {
        click(By.xpath("//input[@value=\'Delete\']"));
    }

    private void selectContact() {
        click(By.xpath("//input[contains(@name, \"selected[]\")]"));
    }

    public boolean isContactPresent() {
        return manager.isElementPresent(By.xpath("//tr[contains(@name, \"entry\")]"));
    }
}
