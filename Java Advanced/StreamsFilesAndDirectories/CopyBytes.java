import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{
            FileInputStream fileStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            PrintWriter writer = new PrintWriter(outputStream);

            int bite = fileStream.read();

            while(bite >= 0){

                if(bite == ' '){
                    writer.print(' ');
                } else if(bite == 10) {
                    writer.println();
                } else{
                    writer.print(bite);
                }


                bite = fileStream.read();
            }

            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
