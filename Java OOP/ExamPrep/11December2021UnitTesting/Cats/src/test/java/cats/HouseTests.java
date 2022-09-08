package cats;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class HouseTests {

    private Cat firstCat;
    private House house;

    @Before
    public void setup(){

        firstCat = new Cat("Petko");
    }

    @Test(expected = NullPointerException.class)
    public void testSetHouseNameToNull(){
        house = new House(null, 200);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityNegative(){
        house = new House("Ivan", -2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void saleCatWhitNameThatNotPresent() {

        house = new House("stefan", 200);
        house.addCat(firstCat);

        house.catForSale("Steve");
    }


    @Test
    public void testGetCount(){
        house = new House("stefan", 200);
        house.addCat(firstCat);

        assertEquals(1, house.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCapacityThrowsFullException(){
        house = new House("petio", 1);

        house.addCat(firstCat);
        house.addCat(new Cat("niki"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemovingNullCatShouldThrowException(){
        house = new House("stefan", 200);
        house.addCat(firstCat);

        house.removeCat("Raph");

    }

    @Test
    public void testRemoveCat(){

        house = new House("petio", 1);

        house.addCat(firstCat);

        house.removeCat("Petko");

        assertEquals(0, house.getCount());
    }

    @Test
    public void saleExistingCat() {

        house = new House("petio", 1);

        house.addCat(firstCat);

        Cat testCat = house.catForSale("Petko");

        assertEquals("Petko", testCat.getName());
        assertFalse(testCat.isHungry());
    }

    @Test
    public void getHouseStatistics() {
        house = new House("petio", 1);

        house.addCat(firstCat);

        String actual = house.statistics();

        assertEquals("The cat Petko is in the house petio!", actual);
    }

    @Test
    public void getHouseName() {
        house = new House("petio", 5);
        String actual = house.getName();

        assertEquals("petio", actual);
    }

    @Test
    public void getHouseCapacity() {
        house = new House("petio", 5);

        assertEquals(5, house.getCapacity());
    }

}
