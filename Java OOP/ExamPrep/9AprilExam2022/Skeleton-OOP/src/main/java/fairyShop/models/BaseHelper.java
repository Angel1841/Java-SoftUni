package fairyShop.models;

import fairyShop.common.ConstantMessages;
import fairyShop.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseHelper implements Helper{

    private String name;
    private int energy;
    private Collection<Instrument> instruments;

    private int workEnergy;


    public BaseHelper(String name, int energy) {
        setName(name);
        this.energy = energy;
        this.instruments = new ArrayList<>();
    }

    @Override
    public void work(){
        energy -= workEnergy;

        if(energy < 0){
            energy = 0;
        }
    }

    @Override
    public void addInstrument(Instrument instrument){
        this.instruments.add(instrument);
    }

    @Override
    public boolean canWork(){
        return energy > 0;
    }

    public void setWorkEnergy(int workEnergy) {
        this.workEnergy = workEnergy;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.HELPER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public String getInfo() {
        return String.format("Name: %s", name) + System.lineSeparator() +
                String.format("Energy: %s", energy) + System.lineSeparator() +
                String.format("Instruments: %d not broken left", (instruments.size() - getBrokenInstrumentCount()));
    }

    public long getBrokenInstrumentCount(){
        return instruments.stream().filter(Instrument::isBroken).count();
    }
}
