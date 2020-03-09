package epam.com.webdriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "InValidEmail")
    public Object[] invalidEmail() {
        return new Object[]{"i@1gmail.com", " @gmail.com", "12_anna@ ", "An_1@2.gmail.com",
                "1a_Agmail.com", "aa@gmail.com", "annA!_Gnna123asqhgfdh@gmail.com", "anna123@g.c",
                "anna123@GMAILLLLLL.COMMMMMM", "№ `?*+`1=3@g ail.com", " ", "0",};
    }

    @Test(dataProvider = "InValidEmail")
    public void checkEmail(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "This email does not meet the requirements");
    }
}
