package catHouse.core;

import catHouse.common.ConstantMessages;
import catHouse.common.ExceptionMessages;
import catHouse.entities.cat.Cat;
import catHouse.entities.cat.LonghairCat;
import catHouse.entities.cat.ShorthairCat;
import catHouse.entities.houses.House;
import catHouse.entities.houses.LongHouse;
import catHouse.entities.houses.ShortHouse;
import catHouse.entities.toys.Ball;
import catHouse.entities.toys.Mouse;
import catHouse.entities.toys.Toy;
import catHouse.repositories.ToyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {

    private ToyRepository toys;
    private Collection<House> houses;

    public ControllerImpl() {
        this.toys = new ToyRepository();
        this.houses = new ArrayList<>();
    }

    private House getHouse(String houseName) {
        return houses.stream().filter(s -> s.getName().equals(houseName)).findFirst().orElse(null);
    }

    @Override
    public String addHouse(String type, String name) {

        House house = null;

        switch (type){
            case"ShortHouse":
                house = new ShortHouse(name);
                break;
            case"LongHouse" :
                house = new LongHouse(name);
                break;

            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_HOUSE_TYPE);
        }

        houses.add(house);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_HOUSE_TYPE, type);
    }

    @Override
    public String buyToy(String type) {

        Toy toy = null;

        switch (type){
            case"Ball":
                toy = new Ball();
                break;
            case"Mouse":
                toy = new Mouse();
                break;

            default:
                throw new NullPointerException(ExceptionMessages.INVALID_TOY_TYPE);
        }

        toys.buyToy(toy);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOY_TYPE, type);

    }

    @Override
    public String toyForHouse(String houseName, String toyType) {

        Toy toy = toys.findFirst(toyType);

        if(toy == null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_TOY_FOUND, toyType));
        }

        House house = getHouse(houseName);
        house.buyToy(toy);
        toys.removeToy(toy);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOY_IN_HOUSE, toyType, houseName);

    }

    @Override
    public String addCat(String houseName, String catType, String catName, String catBreed, double price) {

        Cat cat = null;

        switch (catType){
            case"ShorthairCat":
                cat = new ShorthairCat(catName, catBreed, price);
                break;

            case"LonghairCat":
                cat = new LonghairCat(catName, catBreed, price);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_CAT_TYPE);
        }

        House house = getHouse(houseName);

        if((house.getClass().getSimpleName().equals("ShortHouse") && catType.equals("LonghairCat"))
        || (house.getClass().getSimpleName().equals("LongHouse") && catType.equals("ShorthairCat"))){
            return String.format(ConstantMessages.UNSUITABLE_HOUSE);
        }

        house.addCat(cat);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_CAT_IN_HOUSE, catType, houseName);
    }

    @Override
    public String feedingCat(String houseName) {
        House house = getHouse(houseName);
        house.feeding();
        int catCount = house.getCats().size();

        return String.format(ConstantMessages.FEEDING_CAT, catCount);
    }

    @Override
    public String sumOfAll(String houseName) {

        House house = getHouse(houseName);

        double catsPrice = house.getCats().stream().mapToDouble(Cat::getPrice).sum();
        double toysPrice = house.getToys().stream().mapToDouble(Toy::getPrice).sum();

        double sum = catsPrice + toysPrice;

        return String.format(ConstantMessages.VALUE_HOUSE, houseName, sum);


    }

    @Override
    public String getStatistics() {
        return houses.stream().map(House::getStatistics).collect(Collectors.joining(System.lineSeparator()));
    }
}
