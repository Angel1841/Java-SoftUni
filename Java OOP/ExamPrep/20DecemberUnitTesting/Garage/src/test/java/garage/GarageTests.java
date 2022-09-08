package garage;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GarageTests {

    private static Garage garage;
    private static Car firstCar;
    private static Car secondCar;
    private static Car thirdCar;

    @Before
    public void setup(){
        garage = new Garage();
        firstCar = new Car("Porsche", 300, 4_000_000);
        secondCar = new Car("Lada", 90, 5_000);
        thirdCar = new Car("Porsche", 200, 2_000_000);

        garage.addCar(firstCar);
        garage.addCar(secondCar);
    }

    @Test
    public void TestCountOfCarsInGarage(){


        int expectedSize = garage.getCars().size();

        assertEquals(expectedSize, garage.getCount());

    }

    @Test
    public void TestAllCarsWithMaxSpeedAboveCertainKm(){

        List<Car> carsWithMaxSpeedAboveFifty = garage.findAllCarsWithMaxSpeedAbove(50);

        assertEquals(2, carsWithMaxSpeedAboveFifty.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestNullCarThrowsException(){
        garage.addCar(null);
    }

    @Test
    public void TestMostExpensiveCar(){
        Car theMostExpensiveCar = garage.getTheMostExpensiveCar();

        assertEquals(firstCar, theMostExpensiveCar);
    }

    @Test
    public void TestFindAllCarsByBrand(){
        garage.addCar(thirdCar);
        List<Car> foundCars = garage.findAllCarsByBrand("Porsche");

        assertEquals(2, foundCars.size());
    }

}