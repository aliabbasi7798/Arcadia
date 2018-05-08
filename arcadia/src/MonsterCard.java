class MonsterCard extends Card{
    protected int healthPoint;
    protected int attackPoint;

    protected boolean playField=false;

    protected final int ap=0;
    protected final int hp=0;

    protected boolean nimble;
    protected boolean defender;

    public String kind;

    public void buffer(){
        this.attackPoint=ap;
        this.healthPoint=hp;
    }

    public String getKind() {
        return kind;
    }

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

    public void changeAP(int change){
        this.attackPoint=this.attackPoint+change;
    }

    public void changeHP(int change){
        this.healthPoint=this.healthPoint+change;
        if (this.healthPoint<=0)
            death();
    }

    @Override
    public void faceUp(){        /*face up card on play field*/
        changePlace(hand);
        //do a magical work
        changePlace(playField);
    }

    public void catchCard(){       /*catch a card from deck to hand*/
        changePlace(deck);
        this.face=true;
        changePlace(hand);
    }

    public void death(){  /*when monstercard die*/
        changePlace(playField);
        //do a magical work if card is general or hero
        changePlace(graveYard);
    }

    public void comeBack(){       /* it will be done with some spells*/
        changePlace(graveYard);
        //battle cry should be called again*/
        changePlace(playField);
    }
}
