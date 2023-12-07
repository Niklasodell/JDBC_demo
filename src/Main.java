import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/northwind?user=root&password=botlas");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}