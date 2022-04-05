import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    static class Message{

        private String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        private String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};



        void print(int messages){
            for (int i = 0; i < messages; i++) {
                Random rnd = new Random();
                System.out.printf("%s %s %s - %s\n",this.phrases[rnd.nextInt(phrases.length)],this.events[rnd.nextInt(events.length)],this.authors[rnd.nextInt(authors.length)],this.city[rnd.nextInt(city.length)]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Message message = new Message();
        message.print(n);

    }
}
