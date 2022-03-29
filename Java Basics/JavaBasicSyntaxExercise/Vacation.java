import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;

        switch(day){
            case "Friday":
                if(type.equals("Students") && people < 30){
                    price = people * 8.45;
                }else if(type.equals("Students")){
                    price = people * 8.45;
                    price -= price*0.15;
                }

                if(type.equals("Business") && people < 100){
                    price = people * 10.90;
                }else if(type.equals("Business")){
                    price = (people - 10) * 10.90;
                }

                if(type.equals("Regular") && people >= 10 && people <=20){
                    price = people * 15;
                    price -= price * 0.5;
                }else if(type.equals("Regular")){
                price = people * 15;
                }
            break;

            case "Saturday":
                if(type.equals("Students") && people < 30){
                    price = people * 9.80;
                }else if(type.equals("Students")){
                price = people * 9.80;
                price -= price*0.15;
                }

                if(type.equals("Business") && people < 100){
                    price = people * 15.60;
                }else if(type.equals("Business")){
                    price = (people - 10) * 15.60;
                }

                if(type.equals("Regular") && people >= 10 && people <=20){
                    price = people * 20;
                    price -= price * 0.5;
                }else if(type.equals("Regular")){
                    price = people * 20;
                }
            break;

            case "Sunday":
                if(type.equals("Students") && people < 30){
                    price = people * 10.46;
                }else if(type.equals("Students")){
                price = people * 10.46;
                price -= price*0.15;
            }

                if(type.equals("Business") && people < 100){
                    price = people * 16;
                }else if(type.equals("Business")){
                price = (people - 10) * 16;
            }

                if(type.equals("Regular") && people >= 10 && people <=20){
                    price = people * 22.50;
                    price -= price * 0.5;
                }else if(type.equals("Regular")){
                    price = people * 22.50;
                }
                break;
        }

        System.out.printf("Total price: %.2f",price);

    }
}
