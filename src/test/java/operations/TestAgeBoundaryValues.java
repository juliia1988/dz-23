package operations;

import dataproviders.TestDataProvider;
import org.example.Man;
import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAgeBoundaryValues {

    private Woman woman;
    private Man man;

    @BeforeMethod
    public void createWoman() {
        woman = new Woman("Olena", "Volosyna", 35, "Ÿes");
    }

    @BeforeMethod
    public void createMan() {
        man = new Man("Oleg", "Syvko", 55, "Yes");
    }


    @Test(dataProvider = "age for woman that not Retired", dataProviderClass = TestDataProvider.class)
    public void testWomanNotRetired(int num1, int num2) {
        Assert.assertEquals(woman.isRetired(num1 | num2), 0 > num1 && num2 < 60, "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for woman that Retired", dataProviderClass = TestDataProvider.class)
    public void testWonamRetired(int num3, int num4) {
        Assert.assertEquals(woman.isRetired(num3 | num4), num3 >= 60 && num4 >= 60, "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that Not Retired", dataProviderClass = TestDataProvider.class)
    public void testManNotRetired(int num5, int num6) {
        Assert.assertEquals(man.isRetired(num5 | num6), 0 > num6 && num6 >= 65, "Retired age works with mistakes");
    }

    @Test(dataProvider = "age for man that Retired", dataProviderClass = TestDataProvider.class)
    public void testManRetired(int num7, int num8) {
        Assert.assertEquals(man.isRetired(num7 | num8), num7 >= 65 && num8 >= 65, "Retired age works with mistakes");
    }

}

