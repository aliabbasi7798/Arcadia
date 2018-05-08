 class SeaSerpent extends SpellCaster
{
    public SeaSerpent(int num)
    {
        this.type="11";
        this.attackPoint=1200;
        this.healthPoint=1500;
        this.magicPoint=7;
        name="Sea Serpent";
        nimble=true;
        defender=false;
        this.kind = "Atlantain";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
    public void spell(Team team , MonsterCard monsterCard)
    {
        for(int i =0 ; i < team.playField.normalMonsters.length ; i++)
        {
            if(team.playField.normalMonsters[i].numberInDeck == monsterCard.numberInDeck)
            {
                team.playField.normalMonsters[i].healthPoint -= 1000 ;
            }
        }
    }
}
