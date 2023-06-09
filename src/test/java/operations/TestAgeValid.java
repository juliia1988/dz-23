package operations;

import dataproviders.TestDataProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.example.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(ValidValuesTestListener.class)
public class TestAgeValid {
    @Description("Check that valid age is in range 0 < age < 130 years")
    @Story("StoryID - 1")
    @Test(dataProvider = "age Valid", dataProviderClass = TestDataProvider.class)
    public void testAgeIsValid(int num9, int num10) {
        Person person = new Person("Olena","Volosyna",35,"Yes");
        Assert.assertEquals(person.ageIsValid(num9, num10), 0 < num9 || num10 < 130 , "Age should be more then 0 but less then 130 years");
    }
}