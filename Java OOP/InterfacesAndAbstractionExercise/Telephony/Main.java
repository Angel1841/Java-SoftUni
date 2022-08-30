package Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> numbersToCall = Arrays.stream(console.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> sitesToVisit = Arrays.stream(console.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbersToCall, sitesToVisit);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
