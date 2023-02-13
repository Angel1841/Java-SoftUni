import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class VIlliansNames {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        final Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "admin");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", properties);

        final PreparedStatement statement = connection.prepareStatement("select v.name, count(distinct mv.minion_id) as minions_count from villains v\n" +
                "join minions_villains mv ON mv.villain_id = v.id\n" +
                "group by mv.villain_id\n" +
                "having minions_count > ?\n" +
                "order by minions_count desc;");

        statement.setInt(1, 15);

        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            final String villainName = resultSet.getString("name");
            final int minionsCount = resultSet.getInt("minions_count");

            System.out.printf("%s %d", villainName, minionsCount);
        }

    }
}
