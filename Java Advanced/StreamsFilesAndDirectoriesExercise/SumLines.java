import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))) {

            String line = reader.readLine();

            while(line != null){

                long sum = 0;
                char[] array = line.toCharArray();

                for (char letter:array) {
                    sum += letter;
                }

                System.out.println(sum);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
