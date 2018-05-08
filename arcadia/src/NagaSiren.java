class NagaSiren extends SpellCaster
{
    public NagaSiren(int num)
    {
        this.type="11";
        this.attackPoint=600;
        this.healthPoint=1200;
        this.magicPoint=6;
        name="Naga Siren";
        nimble=false;
        defender=false;
        this.kind = "Atlantain";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
    public void spell(Team team)
    {
        for( int i=0 ; i<team.playField.normalMonsters.length ; i++)
        {
            team.playField.normalMonsters[i].healthPoint +=300;
            team.playField.normalMonsters[i].attackPoint +=250;
        }
    }
}