package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

	private static final String END_COMMAND = "HARVEST";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Class usedClass = RichSoilLand.class;

		Field[] declaredFields = usedClass.getDeclaredFields();

		String command = scanner.nextLine();
		while (!END_COMMAND.equals(command)) {

			switch (command) {
				case "private":
					Arrays.stream(declaredFields).
							filter(s -> Modifier.isPrivate(s.getModifiers())).
							forEach(print());
					break;
				case "protected":
					Arrays.stream(declaredFields).
							filter(s -> Modifier.isProtected(s.getModifiers())).
							forEach(print());
					break;
				case "public":
					Arrays.stream(declaredFields).
							filter(s -> Modifier.isPublic(s.getModifiers())).
							forEach(print());
					break;
				case "all":
					Arrays.stream(declaredFields).
							forEach(print());
					break;
			}

			command = scanner.nextLine();
		}
	}

	private static Consumer<Field> print() {
		return s -> System.out.printf("%s %s %s%n", Modifier.toString(s.getModifiers()), s.getType().getSimpleName(), s.getName());

	}
}
