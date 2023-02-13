import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class AddMinion {

    final static String GET_TOWN_BY_NAME = "select t.id\n" +
            "from towns t \n" +
            "where t.name = ?";

    final static String GET_VILLAIN_BY_NAME = "select v.id\n" +
            "from villains v \n" +
            "where v.name = ?";

    final static String ADD_VILLAIN = "insert into villains(name, evilness_factor) values(?,?)";

    final static String ADD_TOWN = "insert into towns(name) values (?)";

    final static String TOWN_ADDED_FORMAT = "Town %s was added to the database%n";
    final static String VILLAIN_ADDED_FORMAT = "Villain %s was added to the database%n";

    final static String INSERT_INTO_MINIONS = "insert into minions(name, age, town_id) values (?,?,?)";

    final static String SELECT_LAST_MINION = "select m.id from minions m order by m.id desc limit 1";

    final static String INSERT_MINIONS_VILLAINS = "insert into minions_villains(minion_id, villain_id) values (?,?)";

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        String[] inputMinions = scanner.nextLine().split(" ");

        String minionName = inputMinions[1];
        int minionAge = Integer.parseInt(inputMinions[2]);
        String minionTown = inputMinions[3];

        String villainName = scanner.nextLine().split(" ")[1];


        int townID = getID(connection, List.of(minionTown), GET_TOWN_BY_NAME, ADD_TOWN, TOWN_ADDED_FORMAT);

        int villainID = getID(connection, List.of(villainName, "evil"), GET_VILLAIN_BY_NAME, ADD_VILLAIN, VILLAIN_ADDED_FORMAT);

        PreparedStatement minionsStatement = connection.prepareStatement(INSERT_INTO_MINIONS);

        minionsStatement.setString(1, minionName);
        minionsStatement.setInt(2, minionAge);
        minionsStatement.setInt(3, townID);

        minionsStatement.executeUpdate();

        PreparedStatement lastMinionStatement = connection.prepareStatement(SELECT_LAST_MINION);
        ResultSet resultSet = lastMinionStatement.executeQuery();

        resultSet.next();

        int lastMinionId = resultSet.getInt("id");

        PreparedStatement insertIntoMinionsVillains = connection.prepareStatement(INSERT_MINIONS_VILLAINS);
        insertIntoMinionsVillains.setInt(1, lastMinionId);
        insertIntoMinionsVillains.setInt(2, villainID);

        insertIntoMinionsVillains.executeUpdate();

        System.out.printf("Successfully added %s to be minion of %s.", minionName, villainName);
        connection.close();
    }

    private static int getID(Connection connection, List<String> arguments, String select, String insert, String printFormat) throws SQLException {

        String name = arguments.get(0);

        PreparedStatement selectStatement = connection.prepareStatement(select);

        selectStatement.setString(1, name);

        ResultSet resultSet = selectStatement.executeQuery();

        if(!resultSet.next()){
            PreparedStatement insertStatement = connection.prepareStatement(insert);

            for (int i = 1; i <+ arguments.size() ; i++) {
                insertStatement.setString(i, arguments.get(i - 1));
            }

            insertStatement.executeUpdate();

            ResultSet newResultSet = selectStatement.executeQuery();

            newResultSet.next();

            int id = newResultSet.getInt("id");

            System.out.printf(printFormat, name);

            return id;
        }

        return resultSet.getInt("id");

    }
}
