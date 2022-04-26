import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&")).map(String::toString).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Done")){

            String[] tokens = input.split(" \\|+ ");

            String command = tokens[0];

            switch (command){
                case "Add Book":

                    String name = tokens[1];

                    if(!books.contains(name)){
                        books.add(0,name);
                    }

                    break;

                case "Take Book":
                    books.removeIf(book -> book.equals(tokens[1]));
                    break;

                case "Swap Books":
                    String book1 = tokens[1];
                    String book2 = tokens[2];

                    if(books.contains(book1) && books.contains(book2)){

                        int index = books.indexOf(book1);
                        int index2 = books.indexOf(book2);
                        books.set(index,book2);
                        books.set(index2,book1);
                    }

                    break;

                case "Insert Book":
                    if(!books.contains(tokens[1])){
                        books.add(tokens[1]);
                    }
                    break;

                case "Check Book":
                    int index3 = Integer.parseInt(tokens[1]);

                    if(index3 < books.size()){
                        System.out.println(books.get(index3));
                    }

                 break;
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",books));
    }
}
