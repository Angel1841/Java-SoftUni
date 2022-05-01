import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();

        Pattern wordPattern = Pattern.compile("@[#]+(?<startLetter>[A-Z])(?<word>[A-Za-z0-9]{4,})(?<endingLetter>[A-Z])@[#]+");
        Pattern numPattern = Pattern.compile("[\\d]+");


        for (int i = 0; i < n; i++) {

            Matcher wordMatcher = wordPattern.matcher(input);

            if (wordMatcher.find()) {

                String word = wordMatcher.group();
                Matcher numMatcher = numPattern.matcher(word);

                    while(numMatcher.find()){
                        sb.append(numMatcher.group());
                    }

                    if(!numMatcher.find()){

                        System.out.printf("Product group: 00%n");

                    }

            } else {
                System.out.println("Invalid barcode");
            }

            input = scanner.nextLine();
        }


    }


}

