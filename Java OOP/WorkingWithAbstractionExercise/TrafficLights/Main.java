package TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TrafficLights> lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLights::valueOf)
                .collect(Collectors.toList());

        int repetition = scanner.nextInt();

        for (int i = 0; i < repetition; i++) {

            //TrafficLights nextLight = null;

            for (int j = 0; j < lights.size(); j++) {

                TrafficLights currentLight = lights.get(j);

                switch (currentLight) {
                    case RED:
                        currentLight = TrafficLights.GREEN;
                        break;
                    case GREEN:
                        currentLight = TrafficLights.YELLOW;
                        break;
                    case YELLOW:
                        currentLight = TrafficLights.RED;
                }

                System.out.print(currentLight.name() + " ");
                lights.set(j, currentLight);
            }
            System.out.println();
        }


    }
}
