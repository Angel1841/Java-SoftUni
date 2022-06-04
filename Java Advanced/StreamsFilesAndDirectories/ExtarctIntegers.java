import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtarctIntegers {
    public static void main(String[] args) {

        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{
            FileInputStream inputStream = new FileInputStream(path);

            Scanner scanner = new Scanner(inputStream);

            FileOutputStream outputStream = new FileOutputStream("Integers-out.txt");

            PrintWriter writer = new PrintWriter(outputStream);

            while (scanner.hasNext()){

                if(scanner.hasNextInt()){
                    writer.println(scanner.nextInt());
                }
                    scanner.next();

            }

            writer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
