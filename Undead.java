 class Undead extends MonsterCard
{
    public Undead(int num)
    {
        this.type="11";
        this.attackPoint=400;
        this.healthPoint=200;
        this.magicPoint=1;
        name="Undead";
        nimble=false;
        defender=false;
        this.kind = "Vampiric";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
