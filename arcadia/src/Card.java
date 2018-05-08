class Card {
    protected int magicPoint;
    protected boolean face=false;//face=true means known
    protected String name;
    protected String place;



    protected boolean deck=true;
    protected boolean hand=false;
    protected boolean graveYard=false;
    protected String type;//"11":normal   "12":spellcaster    "13":general   "14":hero    "21":instantspell    "22":continuousspell     "23":auraspell

    protected int numberInDeck;


    public Card(){

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place){
        this.place=place;
    }

    public void setMagicPoint(int magicPoint){
        this.magicPoint=magicPoint;
    }

    public int getNumberInDeck() {
        return numberInDeck;
    }

    public void setNumberInDeck(int numberInDeck) {
        this.numberInDeck = numberInDeck;
    }

    public void catchCard(){       /*catch a card from deck to hand*/
        changePlace(deck);
        changePlace(hand);
    }

    public void faceUp(){        /*face up card on play field*/
        changePlace(hand);
        //do a magical work
        changePlace(graveYard);
    }

    public int getMagicPoint(){
        return magicPoint;
    }

    public void changePlace(boolean a){
        if (a==true)
            a=false;
        else
            a=true;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}