package FirstAndReverseTeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Person person){
        if(person.getAge() < 40){
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    @Override
    public String toString() {
        return String.format("First team have %d players%nReserve team have %d players", firstTeam.size(), reserveTeam.size());
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}
