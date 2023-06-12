package utils;

import models.Number;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBReader {

    private final static String URL = "jdbc:postgresql://localhost:4567/postgres";
    private final static String USER_NAME = "postgres";
    private final static String USER_PASSWORD = "Qre@1657koa";

    private final static String QUERY = "select * from numbers";


    public static List<Number> getNumbersFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            Statement sqlStatement = connection.createStatement();
            ResultSet resultSet = sqlStatement.executeQuery(QUERY);

            while (resultSet.next()) {
                Number number = new Number(resultSet.getInt("num1"), resultSet.getInt("num2"),
                        resultSet.getInt("num3"), resultSet.getInt("num4"),
                        resultSet.getInt("num5"), resultSet.getInt("num6"),
                        resultSet.getInt("num7"), resultSet.getInt("num8"),
                        resultSet.getInt("num9"), resultSet.getInt("num10"));
                numbers.add(number);
            }


        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string " + " URL [%s], name [%s]", URL, USER_NAME));
        }
        return numbers;
    }

    public static void main(String[] args) {
        getNumbersFromDB();
    }
}


