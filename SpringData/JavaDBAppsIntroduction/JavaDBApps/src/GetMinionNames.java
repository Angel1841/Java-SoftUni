import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class GetMinionNames {

    private static final String GET_MINIONS_BY_ID_QUERY = "select m.name, m.age from minions m\n" +
            "join minions_villains mv on mv.minion_id = m.id\n" +
            "where mv.villain_id = ?";

    private static final String GET_VILLAIN_BY_ID = "select v.name from villains as v where v.id = ?";

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        final int villainId = scanner.nextInt();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        final PreparedStatement villainStatement = connection.prepareStatement(GET_VILLAIN_BY_ID);

        villainStatement.setInt(1, villainId);

        ResultSet villainResultSet = villainStatement.executeQuery();

        if(!villainResultSet.next()){
            System.out.printf("No villain with ID %d exists in the database.", villainId);
            return;
        }

        String villainName = villainResultSet.getString("name");

        System.out.printf("Villain: %s%n", villainName);



        PreparedStatement minionStatement = connection.prepareStatement(GET_MINIONS_BY_ID_QUERY);

        minionStatement.setInt(1, villainId);

        ResultSet minionResultSet = minionStatement.executeQuery();

        int i = 1;

        while(minionResultSet.next()){
            System.out.printf("%d. %s %d%n", i, minionResultSet.getString("name"), minionResultSet.getInt("age"));
            i++;
        }

        connection.close();

    }
}
