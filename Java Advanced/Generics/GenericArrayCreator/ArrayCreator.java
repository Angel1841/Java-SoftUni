package GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T defvalue){
        T[] arr = (T[])Array.newInstance(defvalue.getClass(), length);

        Arrays.fill(arr, defvalue);

        return arr;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> clazz, int length, T defvalue){

        T[] arr = (T[])Array.newInstance(clazz, length);

        Arrays.fill(arr, defvalue);

        return arr;
    }

}
