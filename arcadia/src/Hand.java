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


}
