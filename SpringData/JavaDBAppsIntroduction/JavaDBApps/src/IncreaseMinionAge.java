import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IncreaseMinionAge {
    public static void main(String[] args) throws SQLException {
        Scanner console = new Scanner(System.in);

        List<String> minionsId = Arrays.stream(console.nextLine().split("\\s+")).toList();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        String updateMinionsSQL = String.format("UPDATE minions SET age = age + 1, `name` = lower(`name`) WHERE id IN (%s);",
                minionsId.stream().map(v -> "?").collect(Collectors.joining(", ")));

        PreparedStatement updateMinions = connection.prepareStatement(updateMinionsSQL);

        for(int i = 1; i <= minionsId.size(); i++) {
            updateMinions.setInt(i, Integer.parseInt(minionsId.get(i-1)));
        }

        updateMinions.executeUpdate();
        printAllMinions(connection);
        connection.close();
    }

    private static void printAllMinions(Connection connection) throws SQLException {
        PreparedStatement selectMinions = connection.prepareStatement("SELECT `name`, age FROM minions ORDER BY id;");

        ResultSet fullSetOfMinions = selectMinions.executeQuery();

        while (fullSetOfMinions.next()) {
            int age = fullSetOfMinions.getInt("age");
            String name = fullSetOfMinions.getString("name");
            System.out.printf("%s %d", name, age);
        }
    }



}
