class ElvenDruid extends SpellCaster{

    public ElvenDruid(int num){
        this.type="12";
        this.attackPoint=600;
        this.healthPoint=1500;
        this.nimble=false;
        this.defender=false;
        this.magicPoint=5;
        this.name="Elven Druid";
        this.kind = "Elf"
        this.numberInDeck = num;
    }

    public void spell(MonsterCard monsterCard){
        monsterCard.changeAP(+300);
        monsterCard.changeHP(+500);
    }
}
