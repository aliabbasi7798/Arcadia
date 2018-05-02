class ElvenDruid extends SpellCaster{

    public ElvenDruid(){
        this.attackPoint=600;
        this.healthPoint=1500;
        this.nimble=false;
        this.defender=false;
        this.magicPoint=5;
        this.name="Elven Druid";
    }

    public void spell(MonsterCard monsterCard){
        monsterCard.changeAP(+300);
        monsterCard.changeHP(+500);
    }
}
