package manager;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

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
    public void removeContact(ContactData contact) {
        openHomePage();
        selectContact(contact);
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
        selectContact(null);
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

    private void selectContact(ContactData contact) {
        click(By.cssSelector(String.format("input[value='%s']", contact.id())));
    }

    public void selectAllContacts() {
        var checkboxes = manager.driver.findElements(By.xpath("//input[contains(@name, \"selected[]\")]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }

    public List<ContactData> getList() {
        openHomePage();
        var contacts = new ArrayList<ContactData>();
        var tds = manager.driver.findElements(By.name("entry"));
        for (var td : tds) {
            var name = td.findElement(By.cssSelector("td:nth-child(2)")).getText();
            var lastName = td.findElement(By.cssSelector("td:nth-child(3)")).getText();
            var checkbox = td.findElement(By.xpath("//input[contains(@name, \"selected[]\")]"));
            var id = checkbox.getAttribute("value");
            contacts.add(new ContactData().withId(id).withName(name).withLastName(lastName));
        }
        return contacts;
    }
}
