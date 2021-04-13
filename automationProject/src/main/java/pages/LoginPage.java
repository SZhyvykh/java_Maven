package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By login = By.id("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUserName(String userName) {
        driver.findElement(username).sendKeys(userName);
    }

    public void inputPassword (String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public SecureArea clickLogin() {
        driver.findElement(login).click();
        return new SecureArea(driver);
    }

}
