class OgreWarrior extends NormalMonster{

    public OgreWarrior(int num){
        this.type="13";
        this.name="Ogre Warrior";
        this.kind="Ogre";
        this.attackPoint=500;
        this.healthPoint=800;
        this.magicPoint=3;
        this.nimble=false;
        this.defender=false;
        this.numberInDeck=num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
