package utils;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {

    public static final String PATH = "src/test/java/resources/data.csv";

    public static List<Number> getListObjectFromCsv() {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH));
            CsvToBean<Number> csvObjectBuilder = new CsvToBeanBuilder<Number>(reader)
                    .withType(Number.class)
                    .build();
            return csvObjectBuilder.parse();
        } catch (IOException ex) {
            throw new RuntimeException("The file could not be found" + PATH + ex);

        }
    }

}
