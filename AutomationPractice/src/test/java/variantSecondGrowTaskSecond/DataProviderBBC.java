package variantSecondGrowTaskSecond;

import org.testng.annotations.DataProvider;

public class DataProviderBBC {
    @DataProvider
    public  Object[][] dataProviderOneHundredWords() {
        return  new  Object[][]{
                {"Ann Hutsulak", "anhutsulak1234512@gmail.com", "Lviv", "3809722222222",
                        "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit). Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are"}};
    }

    @DataProvider
    public  Object[][] dataProviderTwoHundredWords() {
        return  new  Object[][]{
                {"Ann Hutsulak", "anhutsulak1234512@gmail.com", "Lviv", "3809722222222",
                        "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit). Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are.If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit). Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are"}};
    }
}
