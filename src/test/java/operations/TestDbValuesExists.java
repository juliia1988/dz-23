package operations;

import dataproviders.TestDataProvider;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.example.Person;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Random;

public class TestDbValuesExists {

    @Description("Check that values from db could be gotted")
    @Story("StoryID - 2")
    @Test(dataProvider = "numbersDB", dataProviderClass = TestDataProvider.class)
    public void testDbFullfiledWithDataForAge(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
        Person person = new Person("Olena", "Volosyna", 35, "Yes");
        int[] numbers = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        int indexOfValue = new Random().nextInt(9);
        Assert.assertNotEquals(person.getAge(numbers[indexOfValue]), numbers[indexOfValue] != 0,"Age should not be NULL");
    }
}
