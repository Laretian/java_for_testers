package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openContactPage() {
        if (!manager.isElementPresent(By.name("submit"))) {
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
        removeSelectContacts();
        confirmAction();
    }

    public void removeAllContacts() {
        selectAllContacts();
        removeSelectContacts();
        confirmAction();
    }

    public int getCount() {
        openContactPage();
        return manager.driver.findElements(By.name("selected[]")).size();
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

    private void removeSelectContacts() {
        click(By.xpath("//input[@value='Delete']"));
    }

    private void selectContact() {
        click(By.xpath("//input[contains(@name, \"selected[]\")]"));
    }

    public void selectAllContacts() {
        var checkboxes = manager.driver.findElements(By.xpath("//input[contains(@name, \"selected[]\")]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }

}
