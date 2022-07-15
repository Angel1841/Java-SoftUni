package GenericSwapMethodAStrings;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {

    List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.elements) {

            sb.append(String.format("%s: %s%n", element.getClass().getName(), element));
        }
        return sb.toString();
    }

    public void swap(int index1, int index2) {
        T temp = elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, temp);
    }
}
