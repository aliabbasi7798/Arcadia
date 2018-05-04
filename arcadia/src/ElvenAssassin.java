class ElvenAssassin extends NormalMonster{

    public ElvenAssassin(int num){
        this.type="11";
        this.attackPoint=1200;
        this.healthPoint=800;
        this.magicPoint=5;
        this.nimble=true;
        this.defender=false;
        this.name="Elven Assassin";
        this.numberInDeck = num;
        this.kind = "Elf";
    }
}
