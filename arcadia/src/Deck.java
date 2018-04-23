
public class Deck
{
    Card[] cards = new Card[30];
    Card card = new Card();

    public void CatchCard()
    {

        Card[] cards1 = new Card[cards.length-1];

        card = cards[0];

        for(int i=1 ; i <= cards.length - 1 ; i++)
        {
            cards1[i-1] = cards[i];
        }
        cards = cards1;
    }
    public int[] Shuffle(int lenght)
    {
      
    }
    public  void ShuffleCard()
    {

    }
}
