class Imp extends NormalMonster{

    public Imp(int num){
        this.type="11";
        this.attackPoint=500;
        this.healthPoint=300;
        this.magicPoint=2;
        this.defender=false;
        this.nimble=false;
        this.name="Imp";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
