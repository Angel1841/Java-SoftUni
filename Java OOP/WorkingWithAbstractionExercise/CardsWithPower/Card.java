package CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuits;

    public Card(CardSuits cardSuits, CardRank cardRank) {
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }

    public int getPower() {
        return this.cardRank.getValue() + this.cardSuits.getValue();
    }
}
