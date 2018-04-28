abstract class SpellCard extends Card{
    protected boolean deck=true;
    protected boolean hand=false;
    protected boolean graveYard=false;

    public void faceUp(){        /*face up card on play field*/
        changePlace(hand);
        //do a magical work
        changePlace(graveYard);
    }

    public void catchCard(){       /*catch a card from deck to hand*/
        changePlace(deck);
        changePlace(hand);
    }

}
