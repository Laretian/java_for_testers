package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openContactPage() {
        if (!manager.isElementPresent(By.name("firstName"))) {
            click(By.linkText("add new"));
        }
    }

    public void openHomePage() {
        if (!manager.isElementPresent(By.id("maintable"))) {
            click(By.linkText("home"));
        }
    }

    public void createContact(ContactData contact) {
        openContactPage();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }
    public void removeContact() {
        openHomePage();
        selectContact();
        removeSelectContacts();
        confirmAction();
    }

    public void removeAllContacts() {
        openHomePage();
        selectAllContacts();
        removeSelectContacts();
        confirmAction();
    }

    public void modifyContact(ContactData modifiedContact) {
        openHomePage();
        selectContact();
        initContactModification();
        fillContactForm(modifiedContact);
        submitContactModification();
        returnToHomePage();
    }

    private void submitContactModification() {
        click(By.name("update"));
    }

    private void initContactModification() {
        click(By.xpath("//a/img[contains(@title, \"Edit\")]"));
    }

    public int getCount() {
        openHomePage();
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