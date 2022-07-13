package CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class CustomList<T extends Comparable<T>> {
    List<T> elements;

    public CustomList() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }


    public T remove(int index) {
        return elements.remove(index);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }


    public void swap(int index, int index1) {
        Collections.swap(elements, index, index1);
    }

    public int countGreaterThan(T value) {
        return (int) elements.stream().filter(e -> e.compareTo(value) > 0).count();
    }

    public T getMax() {
        return elements.stream().max(Comparable::compareTo).get();
    }

    public T getMin() {
        return elements.stream().min(Comparable::compareTo).get();
    }

    public int size(){
        return elements.size();
    }

    public Stream<T> stream(){
        return elements.stream();
    }

    public T get(int index) {
        return elements.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : elements) {
            sb.append(t).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
