import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while(!input.equals("PARTY")){

            if(input.charAt(0) >= 48 && input.charAt(0) <= 57){
                vip.add(input);
            } else{
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        String coming = scanner.nextLine();

        while(!coming.equals("END")){
            vip.remove(coming);
            regular.remove(coming);

            coming = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String s : vip) {
            System.out.println(s);
        }

        for (String s1 : regular) {
            System.out.println(s1);
        }

    }
}
