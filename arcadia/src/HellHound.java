class HellHound extends NormalMonster{

    public HellHound(int num){
        this.type="11";
        this.attackPoint=1000;
        this.healthPoint=800;
        this.magicPoint=5;
        defender=false;
        nimble=true;
        name="Hell Hound";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
