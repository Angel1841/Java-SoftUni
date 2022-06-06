import java.io.*;
import java.util.Scanner;

public class WriteEveryThird {
    public static void main(String[] args) {

        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));

            String line = reader.readLine();

            int counter = 1;

            while(line != null){

                if(counter % 3 == 0){
                    writer.println(line);
                }

                counter++;
                line = reader.readLine();
            }

            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
