package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
    private WebDriver driver;
    private By clickFormAuthenticationLink = By.linkText("Form Authentication");
    private By clickDropDown = By.linkText("Dropdown");
    private By forgotPassword = By.linkText("Forgot Password");
    private By clickHovers = By.linkText("Hovers");

    public Welcome(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthLink() {
        driver.findElement(clickFormAuthenticationLink).click();
        return new LoginPage(driver);
    }







}
