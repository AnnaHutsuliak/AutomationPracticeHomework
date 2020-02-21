package epam.com.webdriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath{

    @DataProvider(name = "ValidEmail")
    public Object[] validEmail() {
        return new Object[]{"anna123@gmail.com", "an12nna@gmail.com", "12_anna@gmail.com", "An_1@gmail.com",
                "1a_A@gmail.com"}; }

        @Test(dataProvider = "ValidEmail")

        public void checkEmail (String email){

            boolean actualResult = Email.isEmailCorrect(email);
            Assert.assertTrue(actualResult);
        }
    }

