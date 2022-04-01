import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song{

        private String typelist;
        private String name;
        private String time;

        public String getTypelist(){
            return this.typelist;
        }

        public String getName(){
            return this.name;
        }

        Song(String typelist, String name, String time){
                this.typelist = typelist;
                this.name = name;
                this.time = time;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("_");

            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song(type,name,time);

            songs.add(song);
        }

        String command = scanner.nextLine();

        if(command.equals("all")){
            for (Song song: songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song: songs) {
                if(song.getTypelist().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }


    }
}
