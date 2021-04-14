package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Welcome extends BasePageObject {
    private By clickFormAuthenticationLink = By.linkText("Form Authentication");
    private By clickDropDown = By.linkText("Dropdown");
    private By forgotPassword = By.linkText("Forgot Password");
    private By clickHovers = By.linkText("Hovers");

    public Welcome(WebDriver driver) {
        super(driver, log);

    }


    public LoginPage clickFormAuthLink() {
        log.info("Clicking on FormAuthenticationLink");
        driver.findElement(clickFormAuthenticationLink).click();
        return new LoginPage(driver);
    }







}
