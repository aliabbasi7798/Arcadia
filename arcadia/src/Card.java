abstract class Card {
    protected int magicPoint;
    protected boolean face=false;//face=true means known
    protected String name;

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

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
