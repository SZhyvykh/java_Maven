package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

   @Test
    public void testLogin() {
       log.info("Starting testLoginTest");
    var loginPage =welcomePage.clickFormAuthLink();
       loginPage.inputUserName("tomsmith");
       loginPage.inputPassword("SuperSecretPassword!");

    var secureArea = loginPage.clickLogin();
    Assert.assertTrue(secureArea.getSuccessLoginText().contains("You logged into a secure area!"),
                                                          "Login failed");
   }

}
