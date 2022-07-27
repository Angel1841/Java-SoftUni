package CardsWithPower;

public enum CardRank {

    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int rankPower;
    CardRank(int rankPower) {
        this.rankPower = rankPower;
    }

    public int getValue() {
        return rankPower;
    }
}
