import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstNums = Arrays.stream(scanner.nextLine().split(" ")).map(String::toString).collect(Collectors.toList());
        List<String> secondNums = Arrays.stream(scanner.nextLine().split(" ")).map(String::toString).collect(Collectors.toList());

        List<String> full = new ArrayList<>();

        if(firstNums.size() > secondNums.size()){


            for (int j = 0; j < secondNums.size(); j++) {
                full.add(firstNums.get(j));
                full.add(secondNums.get(j));
            }

            for (int i = secondNums.size(); i < firstNums.size(); i++) {
                full.add(firstNums.get(i));
            }

        } else {

            for (int j = 0; j < firstNums.size(); j++) {
                full.add(firstNums.get(j));
                full.add(secondNums.get(j));
            }

            for (int i = firstNums.size(); i < secondNums.size(); i++) {
                full.add(secondNums.get(i));

            }

        }

        for (var item: full) {
            System.out.print(item + " ");
        }

    }
}
