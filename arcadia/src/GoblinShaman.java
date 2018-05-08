class GoblinShaman extends SpellCaster{

    public GoblinShaman(int num){
        this.type="12";
        this.attackPoint=700;
        this.healthPoint=1000;
        this.magicPoint=4;
        defender=false;
        nimble=false;
        name="Goblin Shaman";
        this.numberInDeck=num;
        this.kind="Goblin";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void spell(MonsterCard monsterCard){
        monsterCard.changeHP(400);
    }
}
