class GoblinSmuggler extends NormalMonster{

    public GoblinSmuggler(int num){
        this.type="11";
        this.attackPoint=400;
        this.healthPoint=600;
        this.magicPoint=2;
        defender=false;
        nimble=false;
        name="Goblin Smuggler";
        this.numberInDeck=num;
        this.kind="Goblin";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
