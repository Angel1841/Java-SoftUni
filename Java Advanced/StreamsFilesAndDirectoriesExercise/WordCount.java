import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        try (Scanner scan = new Scanner(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"));
            Scanner textscan = new Scanner(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
            PrintWriter pr = new PrintWriter(new FileWriter("output.txt")))
        {
            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" "))
                    .forEach(word -> wordMap.put(word, 0));

            while (textscan.hasNext()){
                String textinput = textscan.next();
                if(wordMap.containsKey(textinput)){
                    wordMap.put(textinput, wordMap.get(textinput) + 1);
                }
            }


            wordMap.entrySet().forEach(s -> pr.printf("%s - %d%n",s.getKey(),s.getValue()));


        }
         catch(IOException e){
            e.printStackTrace();
        }

    }
}
