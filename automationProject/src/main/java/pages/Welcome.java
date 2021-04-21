package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Welcome extends BasePageObject {
    private By clickFormAuthenticationLink = By.linkText("Form Authentication");
    private By clickDropDown = By.linkText("Dropdown");
    private By forgotPassword = By.linkText("Forgot Password");
    private By clickHovers = By.linkText("Hovers");
    private By checkboxesLink = By.linkText("Checkboxes");
    private By dropdown = By.linkText("Dropdown");

    public Welcome(WebDriver driver) {
        super(driver, log);

    }

    public LoginPage clickFormAuthLink() {
        log.info("Clicking on FormAuthenticationLink");
        driver.findElement(clickFormAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CheckboxPage clickCheckboxLink() {
        log.info("Clicking Checkboxes link on Welcome page");
        click(checkboxesLink);
        return new CheckboxPage(driver, log);

    }

    public DropdownPage clickDropdownLink() {
        log.info("Clicking dropdown link on Welcome page");
        click(dropdown);
        return new DropdownPage(driver, log);

    }







}
