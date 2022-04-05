import java.util.Scanner;

public class Articles {

    static class Article{

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return this.author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s",this.title,this.content,this.author);
        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        int n = Integer.parseInt(scanner.nextLine());

        String title = tokens[0];
        String content = tokens[1];
        String author = tokens[2];

        Article article = new Article(title,content,author);

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(": ");

            String command = input[0];

            switch(command){
                case"Edit":
                    article.setContent(input[1]);
                    break;
                case"ChangeAuthor":
                    article.setAuthor(input[1]);
                    break;
                case"Rename":
                    article.setTitle(input[1]);
                    break;

            }
        }

        System.out.println(article);

    }
}
