package BirthdayCelebrations;

public class Pet implements Birthable{

    private String name;
    private String birthDay;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDay;
    }
}
