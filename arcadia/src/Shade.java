class Shade extends NormalMonster{

    public Shade(int num){
        this.type="11";
        this.attackPoint=800;
        this.healthPoint=500;
        this.magicPoint=3;
        defender=false;
        nimble=false;
        name="Shade";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
