import java.io.*;
import java.util.Locale;

public class ALLCAPITALS {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))){
            PrintWriter pr = new PrintWriter(new FileWriter("allcapitals.txt"));

            reader.lines().forEach(line -> pr.println(line.toUpperCase()));

            pr.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
