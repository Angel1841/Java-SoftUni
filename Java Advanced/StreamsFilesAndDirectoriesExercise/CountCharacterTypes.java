import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\angel\\Documents\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))){
            PrintWriter wr = new PrintWriter(new FileWriter("counts.txt"));

            String line = reader.readLine();

            int vowelCount = 0;
            int consCount = 0;
            int punctCount = 0;

            while(line != null){

                char[] array = line.toCharArray();

                for (char letter:array) {
                    if(letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u'){
                        vowelCount++;
                    } else if(letter == '!' || letter == ',' || letter == '.' || letter == '?'){
                        punctCount++;
                    } else if(letter != ' '){
                        consCount++;
                    }
                }


                line = reader.readLine();
            }

            wr.printf("Vowels: %d%n",vowelCount);
            wr.printf("Consonants: %d%n",consCount);
            wr.printf("Punctuation: %d%n",punctCount);

            wr.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
