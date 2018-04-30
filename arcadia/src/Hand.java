class Hand {
    Card[] cards=new Card[1];

    public void addCard(Card card){
        Card[] card1=new Card[this.cards.length+1];
        card1[0]=card;
        for (int i=0 ; i<this.cards.length ; i++){
            card1[i+1]=cards[i];
        }
        cards=card1;
    }

    public void faceUpCard()
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

    public void getFirstCard() {
        cards[0].faceUp();
        //PlayField.addCart(cards[0]);
    }
}
