import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) {

        String path = "C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{
            List<String> lines = Files.readAllLines(Paths.get(path))
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());

            Path outputpath = Path.of("sortlines.txt");

            Files.write(outputpath, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
