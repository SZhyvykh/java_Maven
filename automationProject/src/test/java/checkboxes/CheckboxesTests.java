package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTests extends BaseTest {

    @Test
    public void testCheckboxes() {
        log.info("Starting testChecboxes test");

       var checkboxes = welcomePage.clickCheckboxLink();
        checkboxes.selectAllCheckboxes();
        Assert.assertTrue(checkboxes.areAllCheckboxesChecked(), "Not all checkboxes are checked");
    }
}
