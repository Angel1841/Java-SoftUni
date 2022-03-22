import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMin;
        int arriveTime = arrivalHour * 60 + arrivalMin;

        String asd = "";
        String output = "";

        int diff = Math.abs(examTime - arriveTime);

        if(arriveTime < examTime - 30){
            asd = "Early";

            if(diff < 60){
            output = String.format("%d minutes before the start", diff);
            } else{
                int h = diff /60;
                int m = diff % 60;
                output = String.format("%d:%02d hours before the start", h,m);
            }

        } else if(arriveTime <= examTime){

            asd = "On Time";
            output = String.format("On Time\n%d minutes before the start", diff);
            
        } else {

            asd = "late";

            if(diff<60){
                output = String.format("%d minutes after the start", diff);
            } else{
                int h = diff /60;
                int m = diff % 60;
                output = String.format("%d:%02d hours after the start", h,m);
            }
        }

        System.out.println(asd);
        System.out.println(output);
    }
}
