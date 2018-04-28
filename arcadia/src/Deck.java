public class Deck
{
    Card[] cards = new Card[30];

    public void CatchCard()
    {
        Card card;
        Card[] cards1 = new Card[cards.length-1];

        card = cards[0];
        getFirstCard();
        for(int i=1 ; i <= cards.length - 1 ; i++)
        {
            cards1[i-1] = cards[i];
        }
        cards = cards1;
    }

    public Card getFirstCard() {
        return cards[0];
    }
}
