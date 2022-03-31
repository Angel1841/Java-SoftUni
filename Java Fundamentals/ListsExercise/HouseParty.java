import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
                String input = scanner.nextLine();
                String[] data = input.split(" ");
                String name = data[0];

                    if(!input.contains("not")){
                        if(guests.contains(name)){
                            System.out.printf("%s is already in the list!\n",name);
                        } else{
                            guests.add(name);
                        }
                    } else {
                        if(guests.contains(name)){
                            guests.remove(name);
                        } else{
                            System.out.printf("%s is not in the list!\n",name);
                        }
                    }
        }
        for (var human: guests) {
            System.out.println(human);
        }
    }
}
