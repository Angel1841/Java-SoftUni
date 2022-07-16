package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg){
        if(this.data.size() < capacity){
            data.add(egg);
        }
    }

    public boolean removeEgg(String color){
        return this.data.removeIf(s -> s.getColor().equals(color));
    }

    public Egg getStrongestEgg(){

        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }

    public Egg getEgg(String color){
        return this.data.stream().filter(e -> e.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount(){
        return this.data.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s basket contains:%n", this.material));
        for (var egg: this.data) {
            sb.append(egg.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString();

    }
}
