package epam.com.webdriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {

    @DataProvider(name = "ValidEmail")
    public Object[] validEmail() {
        return new Object[]{"an12nna@1mail.com", "12_anna@GMAIL.com", "An_1@gmail.com",
                "1a_A@gm.co", "aaQaaa1Af!aaaa_aaAf1@Gmail.commm", "a_!@gmail.com"};
    }

    @Test(dataProvider = "ValidEmail")
    public void checkEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "This email does not meet the requirements");
    }
}

