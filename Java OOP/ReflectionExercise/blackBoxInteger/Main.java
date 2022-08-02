package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    private static final String END_COMMAND = "END";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> reflection = BlackBoxInt.class;

        Constructor constructor = reflection.getDeclaredConstructor(int.class);

        constructor.setAccessible(true);

        BlackBoxInt instance = (BlackBoxInt) constructor.newInstance(0);

        String command = scanner.nextLine();

        while (!END_COMMAND.equals(command)) {
            String[] attributes = command.split("_");

            Method method = reflection.getDeclaredMethod(attributes[0], int.class);
            method.setAccessible(true);
            method.invoke(instance, Integer.parseInt(attributes[1]));

            Field innerValue = reflection.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.getInt(instance));

            command = scanner.nextLine();
        }
    }
}
