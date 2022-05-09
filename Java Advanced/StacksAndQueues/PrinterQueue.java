import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while(!line.equals("print")){

            if(line.equals("cancel")){

                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    System.out.printf("Canceled %s%n", queue.peek());
                    queue.poll();
                }

            }else{
                queue.offer(line);
            }

            line = scanner.nextLine();
        }

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
