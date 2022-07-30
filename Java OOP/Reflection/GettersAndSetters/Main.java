package GettersAndSetters;

import HighQualityMistakes.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<HighQualityMistakes.Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

        List<Method> getters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("get"))
                .sorted(Comparator.comparing(Method::getName))
                .toList();

        List<Method> setters = Arrays.stream(methods)
                .filter(m -> m.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName))
                .toList();


        getters.stream()
                .forEach(m -> {
            System.out.printf("%s will return class %s%n", m.getName(), m.getReturnType().getName());
        } );

        setters.stream().forEach(m -> {
            System.out.printf("%s and will set field of class %s%n", m.getName(), m.getParameterTypes()[0].getName());
        });
    }

}
