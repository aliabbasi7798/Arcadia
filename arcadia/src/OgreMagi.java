class OgreMagi extends SpellCaster{

    public OgreMagi(int num){
        this.type="12";
        this.name="Ogre Magi";
        this.kind="Ogre";
        this.attackPoint=800;
        this.healthPoint=1500;
        this.magicPoint=5;
        this.nimble=false;
        this.defender=false;
        this.numberInDeck=num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void spell(MonsterCard monsterCard){
        monsterCard.changeAP(400);
    }
}
