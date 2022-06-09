import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
        List<String> lines = Files.readAllLines(path);

        PrintWriter pr = new PrintWriter(new FileWriter("output.txt"));

        for (int i = 0; i < lines.size(); i++) {
            pr.println((i+1) + ". " + lines.get(i));
        }

        pr.flush();
    }
}
