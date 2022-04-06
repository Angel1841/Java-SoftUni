import java.util.*;

public class OddOccurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts= new LinkedHashMap<>();

        for (String word : words) {

            String wordLowerCase = word.toLowerCase();

            if(counts.containsKey(wordLowerCase)){
                counts.put(wordLowerCase, counts.get(wordLowerCase) + 1);
            } else{
                counts.put(wordLowerCase, 1);
            }

        }

        List<String> print = new ArrayList<>();

                for (var entry : counts.entrySet()) {
                    if(entry.getValue() % 2 != 0){
                        print.add(entry.getKey());
                    }
                }

        for (int i = 0; i < print.size(); i++) {

            System.out.print(print.get(i));

            if(i < print.size() - 1){
                System.out.print(", ");
            }
        }

        }
}
