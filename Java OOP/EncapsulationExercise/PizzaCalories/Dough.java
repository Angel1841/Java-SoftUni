package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if("White".equals(flourType) || "Wholegrain".equals(flourType)){
            this.flourType = flourType;
        } else{
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if("Crispy".equals(bakingTechnique) || "Chewy".equals(bakingTechnique) || "Homemade".equals(bakingTechnique)){
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return 2 * weight * getDoughModifier() * getBakingTechniqueModifier();
    }

    private double getDoughModifier(){
        switch (flourType){
            case"White":
                return  1.5;
            case"Wholegrain":
                return 1.0;
        }
        return 0;
    }

    private double getBakingTechniqueModifier() {
        switch(bakingTechnique){
            case"Crispy":
                return 0.9;

            case "Chewy":
                return 1.1;

            case "Homemade":
                return 1.0;
        }
        return 0;
    }
}
