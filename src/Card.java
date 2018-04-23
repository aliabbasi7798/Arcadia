abstract class Card {
    protected int magicPoint;

    public void setMagicPoint(int magicPoint){
        this.magicPoint=magicPoint;
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

}
