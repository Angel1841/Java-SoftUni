package PizzaCalories;

public class Topping {

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if("Meat".equals(toppingType) || "Veggies".equals(toppingType) || "Cheese".equals(toppingType) || "Sauce".equals(toppingType)){
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50){
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return 2 * weight * getToppingModifier();
    }

    private double getToppingModifier(){
        switch (toppingType){
            case"Meat":
                return 1.2;
            case"Veggies":
                return 0.8;
            case"Cheese":
                return 1.1;
            case"Sauce":
                return 0.9;
        }
        return 0;
    }
}
