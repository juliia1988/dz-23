package utils;

import models.Number;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBReader {
    private final static String URL = "jdbc:postgresql://localhost:4567/postgres";
    private final static String USER_NAME = "postgres";
    private final static String USER_PASSWORD = "Qre@1657koa";

    private final static String QUERY_SELECT_ALL = "select * from numbers";
    private final static String QUERY_SELECT_BY_ID = "select * from numbers where id=?";
    private final static String QUER_INSERT = "insert into numbers values(?,?,?,?,?,?,?,?,?,?,?)";
    private final static String QUERY_UPDATE = "update numbers set num1=? where id=?";
    private final static String QUERY_DELETE = "delete from numbers where id=?";

    public static List<Number> getNumbersFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            Statement sqlStatement = connection.createStatement();
            ResultSet resultSet = sqlStatement.executeQuery(QUERY_SELECT_ALL);

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

    public static List<Number> selectNumberByIdFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SELECT_BY_ID);

            preparedStatement.setInt(1, 2);
            ResultSet resultSet = preparedStatement.executeQuery();

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

    public static List<Number> insertNumbersFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(QUER_INSERT);
            preparedStatement.setInt(1, 3);
            preparedStatement.setInt(2, 25);
            preparedStatement.setInt(3, 35);
            preparedStatement.setInt(4, 45);
            preparedStatement.setInt(5, 55);
            preparedStatement.setInt(6, 65);
            preparedStatement.setInt(7, 75);
            preparedStatement.setInt(8, 85);
            preparedStatement.setInt(9, 95);
            preparedStatement.setInt(10, 105);
            preparedStatement.setInt(11, 115);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string " + " URL [%s], name [%s]", URL, USER_NAME));
        }
        return numbers;
    }

    public static List<Number> updateNumbersFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE);
            preparedStatement.setInt(1, 66);
            preparedStatement.setInt(2, 3);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string " + " URL [%s], name [%s]", URL, USER_NAME));
        }
        return numbers;
    }

    public static List<Number> deleteNumbersFromDB() {
        List<Number> numbers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string " + " URL [%s], name [%s]", URL, USER_NAME));
        }
        return numbers;
    }

    public static void main(String[] args) {
        getNumbersFromDB();
        selectNumberByIdFromDB();
        insertNumbersFromDB();
        updateNumbersFromDB();
        deleteNumbersFromDB();
    }
}


