class ElvenHunter extends NormalMonster{

    public ElvenHunter(int num){
        type="11";
        name="Elven Hunter";
        attackPoint=600;
        healthPoint=800;
        magicPoint=3;
        nimble=false;
        defender=false;
        this.kind="Elf";
        this.numberInDeck=num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

}
