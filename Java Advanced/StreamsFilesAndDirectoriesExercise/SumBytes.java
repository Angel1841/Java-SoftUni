import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))){

            String line = reader.readLine();

            long sum = 0;

            while(line != null){

                char[] letters = line.toCharArray();

                for (char letter: letters) {
                    sum += letter;
                }

                line = reader.readLine();
            }

            System.out.println(sum);

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
