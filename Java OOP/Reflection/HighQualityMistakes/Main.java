package HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class clazz = Reflection.class;

        Arrays.stream(clazz.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> {
                    if (!Modifier.isPrivate(f.getModifiers())) {
                        System.out.printf("%s must be private!%n", f.getName());
                    }
                });

        Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> m.getName().startsWith("get") || m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(s -> {
                    if (s.getName().contains("get") && !Modifier.isPublic(s.getModifiers())) {
                        System.out.printf("%s have to be public!%n", s.getName());
                    }  else if (s.getName().contains("set") && !Modifier.isPrivate(s.getModifiers())) {
                        System.out.printf("%s have to be private!%n", s.getName());
                    }
                });
    }
}
