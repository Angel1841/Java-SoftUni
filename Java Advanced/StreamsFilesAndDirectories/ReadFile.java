import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try(FileInputStream filesStream = new FileInputStream(path)){
            int num = filesStream.read();
            while(num >= 0){

                System.out.printf("%s ", Integer.toBinaryString(num));

                num = filesStream.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
