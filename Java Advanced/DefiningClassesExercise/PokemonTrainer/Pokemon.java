package PokemonTrainer;

public class Pokemon {

    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }


    public boolean isDead(){
        this.health -= 10;
        if(this.health <= 0){
            return true;
        } else{
            return false;
        }
    }


    public String getElement() {
        return element;
    }

}
