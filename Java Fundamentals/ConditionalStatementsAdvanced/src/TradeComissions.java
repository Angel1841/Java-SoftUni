import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0;


            if(town.equals("Sofia")){
                if(sells <= 500 && sells >= 0){
                    commission = sells * 0.05;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 500 && sells <= 1000){
                    commission = sells * 0.07;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 1000 && sells <= 10000) {
                    commission = sells * 0.08;
                    System.out.printf("%.2f",commission);
                } else if(sells > 10000) {
                    commission = sells * 0.12;
                    System.out.printf("%.2f",commission);
                }else if(sells < 0)System.out.println("error");
            }



            else if(town.equals("Varna")){
                if(sells <= 500 && sells >= 0){
                    commission = sells * 0.045;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 500 && sells <= 1000){
                    commission = sells * 0.075;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 1000 && sells <= 10000) {
                    commission = sells * 0.10;
                    System.out.printf("%.2f",commission);
                } else if(sells > 10000) {
                    commission = sells * 0.13;
                    System.out.printf("%.2f",commission);
                }  else if(sells < 0)System.out.println("error");
            }



              else if(town.equals("Plovdiv")){
                if(sells <= 500 && sells >= 0){
                    commission = sells * 0.055;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 500 && sells <= 1000){
                    commission = sells * 0.08;
                    System.out.printf("%.2f",commission);
                } else if(sells >= 1000 && sells <= 10000) {
                    commission = sells * 0.12;
                    System.out.printf("%.2f",commission);
                } else if(sells > 10000) {
                    commission = sells * 0.145;
                    System.out.printf("%.2f",commission);
                }  else if(sells < 0)System.out.println("error");

              }

                else System.out.println("error");

    }
}
