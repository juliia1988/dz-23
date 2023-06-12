package dataproviders;

import org.testng.annotations.DataProvider;

import static utils.CsvReader.getListObjectFromCsv;
import static utils.DBReader.getNumbersFromDB;


public class TestDataProvider {

    private static final String PATH = "src/test/java/resources/data.csv";

    @DataProvider(name = "age for woman that not Retired")
    public static Object[][] numbersWomanNotRetired() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum1(), number.getNum2()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for woman that Retired")
    public static Object[][] numbersWomanRetired() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum3(), number.getNum4()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for man that Not Retired")
    public static Object[][] numbersManNotRetired() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum5(), number.getNum6()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for man that Retired")
    public static Object[][] numbersManRetired() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum7(), number.getNum8()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age Valid")
    public static Object[][] numbersAgeValid() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum9(), number.getNum10()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "numbersDB")
    public static Object[][] numbersFromDB() {
        return getNumbersFromDB().stream().map(number -> new Object[]{number.getNum1(),number.getNum2(),number.getNum3(),
                        number.getNum4(),number.getNum5(),number.getNum6(),number.getNum7(),number.getNum8(),number.getNum9(),
                        number.getNum10()})
                .toArray(Object[][]::new);
    }

}

