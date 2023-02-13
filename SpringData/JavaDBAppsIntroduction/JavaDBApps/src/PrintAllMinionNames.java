import java.sql.*;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PrintAllMinionNames {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        PreparedStatement getAllMinions = connection.prepareStatement("SELECT `name`, age FROM minions ORDER BY id;");
        ResultSet resultSet = getAllMinions.executeQuery();

        ArrayDeque<String> minionsName = new ArrayDeque<>();

        while (resultSet.next()) {
            minionsName.offer(resultSet.getString("name"));
        }

        while (minionsName.size() > 2){
            System.out.println(minionsName.pollFirst());
            System.out.println(minionsName.pollLast());
        }

        while(!minionsName.isEmpty()) {
            System.out.println(minionsName.poll());
        }

        connection.close();
    }
}
