 class GiantBat extends MonsterCard
{
    public GiantBat(int num)
    {
        this.type="11";
        this.attackPoint=900;
        this.healthPoint=500;
        this.magicPoint=3;
        name="Giant Bat";
        nimble=true;
        defender=false;
        this.kind = "Vampiric";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
}
