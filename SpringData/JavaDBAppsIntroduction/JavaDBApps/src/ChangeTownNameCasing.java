import java.lang.constant.Constable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ChangeTownNameCasing {

    private static final String UPDATE_TOWN_NAME = "update towns t set name = upper(name) where t.country = ?";
    private static final String GET_ALL_TOWNS_BY_COUNTRY = "select t.name from towns t where t.country = ?";

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/minions_db", "root", "admin");

        String townName = scanner.nextLine();

        PreparedStatement updateTownStatement = connection.prepareStatement(UPDATE_TOWN_NAME);
        updateTownStatement.setString(1, townName);

        int updatedRolls = updateTownStatement.executeUpdate();

        if(updatedRolls == 0){
            System.out.println("No town names were affected.");
            return;
        }

        System.out.printf("%d towns names were affected.", updatedRolls);


        PreparedStatement allTowns = connection.prepareStatement(GET_ALL_TOWNS_BY_COUNTRY);
        allTowns.setString(1, townName);
        ResultSet resultSetAllTowns = allTowns.executeQuery();

        ArrayList<String> towns = new ArrayList<>();

        while(resultSetAllTowns.next()){
            towns.add(resultSetAllTowns.getString("name"));
        }

        System.out.println(towns);
        connection.close();
    }
}
