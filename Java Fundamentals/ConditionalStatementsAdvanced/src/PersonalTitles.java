import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if(gender.equals("m") && age>=16){
            System.out.println("Mr.");
        } else if(gender.equals("m") && age<16){
            System.out.println("Master");
        } else if(gender.equals("f") && age>=16) {
            System.out.println("Ms.");
        } else if(gender.equals("f") && age<16) {
            System.out.println("Miss");
        }

    }
}
