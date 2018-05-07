class ElvenRanger extends NormalMonster{

    public ElvenRanger(int num){
        this.type="11";
        this.attackPoint=400;
        this.healthPoint=300;
        this.magicPoint=1;
        name="Elven Ranger";
        nimble=false;
        defender=false;
        this.kind="Elf";
        this.numberInDeck=num;
    }
}
