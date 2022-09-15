package petStore;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PetStoreTests {

    private PetStore petStore;

    private Animal firstAnimal;
    private Animal secondAnimal;
    private Animal thirdAnimal;
    private Animal fourthAnimal;

    @Before
    public void setup(){

        petStore = new PetStore();

        firstAnimal = new Animal("Dog", 60, 1000.40);

        secondAnimal = new Animal("Kitten", 7, 325.80);
        thirdAnimal = new Animal("Parrot", 5, 4800.40);
        fourthAnimal = new Animal("Dog", 3, 222.22);

        petStore.addAnimal(firstAnimal);
        petStore.addAnimal(secondAnimal);
        petStore.addAnimal(thirdAnimal);
        petStore.addAnimal(fourthAnimal);

    }

    @Test
    public void testGetAnimalsCount(){
        assertEquals(4, petStore.getCount());
    }

    @Test
    public void testMaxKg(){

        List<Animal> expectedAnimals = new ArrayList<>();
        expectedAnimals.add(firstAnimal);
        expectedAnimals.add(secondAnimal);

        List<Animal> given = petStore.findAllAnimalsWithMaxKilograms(6);

        assertEquals(expectedAnimals, given);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullAnimal(){

        petStore.addAnimal(null);

    }

    @Test
    public void testMostExpensiveAnimal(){

        assertEquals(thirdAnimal, petStore.getTheMostExpensiveAnimal());

    }


    @Test
    public void testReturnOfSortingBySpecies(){

        List<Animal> given = new ArrayList<>();
        given.add(firstAnimal);
        given.add(fourthAnimal);

        List<Animal> sortedAnimals = petStore.findAllAnimalBySpecie("Dog");

        assertEquals(given, sortedAnimals);
    }

}

