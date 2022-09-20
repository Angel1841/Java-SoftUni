package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public String getName() {
        return name;
    }

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty() || name.length() < 1 || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) {
        if(numberOfToppings >= 0 && numberOfToppings <= 10){
            this.toppings = new ArrayList<>(numberOfToppings);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

    }

    public double getOverallCalories() {
        return dough.calculateCalories() + toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
