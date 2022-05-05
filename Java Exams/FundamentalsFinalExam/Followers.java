import java.util.*;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> followers = new LinkedHashMap<>();

        while(!input.equals("Log out")){

            String[] tokens = input.split(": ");

            String command = tokens[0];

            switch (command){
                case"New follower":

                    String person = tokens[1];

                    if(!followers.containsKey(person)){
                        followers.put(person, 0);
                    }

                    break;


                case"Like":

                    String givenPerson = tokens[1];
                    int likes = Integer.parseInt(tokens[2]);

                    if(!followers.containsKey(givenPerson)){
                        followers.put(givenPerson, likes);
                    }else{
                        followers.put(givenPerson,followers.get(givenPerson) + likes);
                    }

                    break;

                case"Comment":

                    String follower = tokens[1];

                    if(followers.containsKey(follower)){
                        followers.put(follower,followers.get(follower) + 1);
                    } else{
                        followers.put(follower, 1);
                    }

                    break;

                case"Blocked":

                    String toBlock = tokens[1];

                    if(followers.containsKey(toBlock)){
                        followers.remove(toBlock);

                    }else{
                        System.out.printf("%s doesn't exist.%n",toBlock);
                    }


                    break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("%d followers%n",followers.size());

        for (Map.Entry<String, Integer> entry : followers.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }


    }
}
