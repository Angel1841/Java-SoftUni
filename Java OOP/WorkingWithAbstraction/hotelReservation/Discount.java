package HotelReservation;

public enum Discount {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);

    private double percentageReduction;

    Discount(double percentageReduction) {
        this.percentageReduction = percentageReduction;
    }

    public double getPercentageReduction() {
        return percentageReduction;
    }

    public static Discount parse(String str){
        switch (str){
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;

            default:
                throw new IllegalArgumentException("Unknown enum value " + str);
        }
    }
}
