 class Card {
    protected int magicPoint;
    protected boolean face=false;//face=true means known
    protected String name;

    protected boolean deck=true;
    protected boolean hand=false;
    protected boolean graveYard=false;

    public void setMagicPoint(int magicPoint){
        this.magicPoint=magicPoint;
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
