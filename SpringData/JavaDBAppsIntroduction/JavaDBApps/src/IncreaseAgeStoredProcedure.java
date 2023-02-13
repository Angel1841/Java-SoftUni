

import java.sql.*;
import java.util.Scanner;


public class IncreaseAgeStoredProcedure {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        Scanner scanner = new Scanner(System.in);

        int minionId = scanner.nextInt();

                CallableStatement getOlderStoredProcedure = connection.prepareCall("{CALL usp_get_older (?)}");
                getOlderStoredProcedure.setInt(1, minionId);
                getOlderStoredProcedure.execute();

                PreparedStatement minionsStatement = connection.prepareStatement("select m.name, m.age from `minions` as m where id = ?");
                minionsStatement.setInt(1, minionId);
                ResultSet minionsSet = minionsStatement.executeQuery();
                minionsSet.next();

                System.out.printf("%s %d%n", minionsSet.getString("name"), minionsSet.getInt("age"));

    }
}

