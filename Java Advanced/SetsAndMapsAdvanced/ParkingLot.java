import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while(!input.equals("END")){

            String[] tokens = input.split(", ");

            String command = tokens[0];
            String id = tokens[1];

            switch(command){
                case "IN":
                        parkingLot.add(id);
                    break;

                case "OUT":
                        parkingLot.remove(id);
                    break;
            }

            input = scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else{
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }

    }
}
