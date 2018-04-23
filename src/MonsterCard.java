abstract class MonsterCard extends Card{
    protected int healthPoint;
    protected int attackPoint;
    protected boolean graveYard=false;
    protected boolean playField=false;
    protected boolean deck=true;
    protected boolean hand=false;

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }

    public int getAttackPoint(){
        return this.attackPoint;
    }

    public void faceUp(){        /*face up card on play field*/
        changePlace(hand);
        //do a magical work if card is general or hero
        changePlace(graveYard);
    }

    public void catchCard(){       /*catch a card from deck to hand*/
        changePlace(deck);
        changePlace(hand);
    }

    public void death(){  /*when monstercard die*/
        changePlace(playField);
        //do a magical work if card is general or hero
        changePlace(graveYard);
    }
}
