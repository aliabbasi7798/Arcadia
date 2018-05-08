class OgreFrontLiner extends NormalMonster{

    public OgreFrontLiner(int num){
        this.type="11";
        this.name="Ogre FrontLiner";
        this.kind="Ogre";
        this.attackPoint=600;
        this.healthPoint=1800;
        this.magicPoint=5;
        this.nimble=false;
        this.defender=true;
        this.numberInDeck=num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
