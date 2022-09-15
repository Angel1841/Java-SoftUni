package fairyShop.models;

public class ShopImpl implements Shop{

    @Override
    public void craft(Present present, Helper helper) {

        for (Instrument instrument: helper.getInstruments()) {

            while(!instrument.isBroken() && !present.isDone()){

                helper.work();
                instrument.use();
                present.getCrafted();

                if(!helper.canWork())
                    return;
            }

        }

    }
}
