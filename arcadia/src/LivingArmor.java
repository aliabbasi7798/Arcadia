class LivingArmor extends NormalMonster{

    public LivingArmor(int num){
        this.type="11";
        this.attackPoint=400;
        this.healthPoint=1500;
        this.magicPoint=5;
        defender=true;
        nimble=false;
        name="Living Armor";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
