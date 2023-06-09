package dataproviders;

import org.testng.annotations.DataProvider;

import static utils.CsvReader.getListObjectFromCsv;


public class TestDataProvider {

    private static final String PATH = "src/test/java/resources/data.csv";

    @DataProvider(name = "age for woman that not Retired")
    public static Object[][] numbersWomanNotRetired() {
        return getListObjectFromCsv().stream().map(number -> new Object[]{number.getNum1(), number.getNum2()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for woman that Retired")
    public static Object[][] numbersWomanRetired() {
        return getListObjectFromCsv().stream().map(number -> new Object[]{number.getNum3(), number.getNum4()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for man that Not Retired")
    public static Object[][] numbersManNotRetired() {
        return getListObjectFromCsv().stream().map(number -> new Object[]{number.getNum5(), number.getNum6()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age for man that Retired")
    public static Object[][] numbersManRetired() {
        return getListObjectFromCsv().stream().map(number -> new Object[]{number.getNum7(), number.getNum8()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "age Valid")
    public static Object[][] numbersAgeValid() {
        return getListObjectFromCsv().stream().map(number -> new Object[]{number.getNum9(), number.getNum10()})
                .toArray(Object[][]::new);
    }

}

