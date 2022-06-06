import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream fileStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            Set<Character> symbols = Set.of(',', '.', '!', '?');

            int read = fileStream.read();

            while(read >= 0){

                if(!symbols.contains((char)read)){
                    outputStream.write(read);

                }

                read = fileStream.read();
            }



        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
