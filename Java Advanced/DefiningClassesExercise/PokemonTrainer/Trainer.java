package PokemonTrainer;

import java.util.List;

public class Trainer {

    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.badges = 0;
        this.pokemons = pokemons;
    }


    public boolean hasElement(String element){
        for (var pokemon: pokemons) {
            if(pokemon.getElement().equals(element)){
                return true;
            }
        }
        return false;
    }

    public void takeDmg(){
        pokemons.removeIf(Pokemon::isDead);
    }

    public void recieveBadge(){
        this.badges += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
