package epam.com.webdriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "InValidEmail")
    public Object[] invalidEmail() {
        return new Object[]{"i@1gmail.com", " @gmail.com", "12_anna@ ", "An_1@2.gmail.com",
                "1a_Agmail.com"}; }

    @Test(dataProvider = "InValidEmail")

    public void checkEmail (String email){

        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);
    }
}
