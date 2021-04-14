package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePageObject {
    protected WebDriver driver;
    protected static Logger log = LogManager.getLogger(BasePageObject.class);

    public BasePageObject(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);

    }

    protected List<WebElement> findAll (By locator) {
        return driver.findElements(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }


}


