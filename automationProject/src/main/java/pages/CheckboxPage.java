package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage extends BasePageObject {
    private By checkbox = By.xpath("//input[@type='checkbox']");

    public CheckboxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectAllCheckboxes() {
        log.info("Checking all unchecked checkboxes");
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()) {
                checkbox.click();
            }
        }

    }


    /**
     * Verify that all available checkboxes are checked
     */
    public boolean areAllCheckboxesChecked() {
        log.info("Verify that all checkboxes are checked");
        List<WebElement> checkboxes = findAll(checkbox);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                return false;
            }
        }
        return true;
    }


}
