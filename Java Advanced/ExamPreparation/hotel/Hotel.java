package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> roster;
    private String name;
    private int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if(roster.size() < capacity){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        return roster.removeIf(p -> p.getName().equals(name));
    }

    public Person getPerson(String name, String hometown){

        for (Person person : roster) {
            if(person.getName().equals(name) && person.getHometown().equals(hometown)){
                return person;
            }

        }

        return null;

    }

    public int getCount(){
        return roster.size();
    }

    public String getStatistics(){

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("The people in the hotel %s are:%n", this.name));

        for (Person person: roster) {
            sb.append(person);
            sb.append(System.lineSeparator());
        }

        return sb.toString();

    }

}
