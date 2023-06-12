package operations;

import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSurnameChange {

    @Test
    public void testSurnameWasChangedCorrectly() {
        Woman woman = new Woman("Olena","Voloshyna",35,"Yes");
        Assert.assertEquals(woman.deregisterPartnership("Gromova"),"Gromova", "LastName should be changed because parthner is existed");
    }
}
