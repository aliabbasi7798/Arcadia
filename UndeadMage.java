 class UndeadMage extends  SpellCaster
{
    public UndeadMage(int num)
    {
        this.type="12";
        this.attackPoint=1000;
        this.healthPoint=800;
        this.magicPoint=6;
        name="Undead Mage";
        nimble=false;
        defender=false;
        this.kind = "Vampiric";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
    public void Spell(Team team)
    {

        for(int i=0 ;i<team.playField.normalMonsters.length ; i++)
        {
            team.playField.normalMonsters[i].attackPoint -= 500;
        }
        for(int i=0 ;i<team.playField.spellCasters.length ; i++)
        {
            team.playField.spellCasters[i].attackPoint -= 500;
        }
        for(int i=0 ;i<team.playField.generals.length ; i++)
        {
            team.playField.generals[i].attackPoint -= 500;
        }
        for(int i=0 ;i<team.playField.heroes.length ; i++)
        {
            team.playField.heroes[i].attackPoint -= 500;
        }
    }
}
