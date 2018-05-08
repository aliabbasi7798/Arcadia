 class Kraken extends General
{

    public Kraken(int num)
    {
        this.type="11";
        this.attackPoint=2200;
        this.healthPoint=1800;
        this.magicPoint=8;
        name="Kraken";
        nimble=false;
        defender=false;
        this.kind = "Atlantain";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
    public void BattleCry(Team team)
    {
        int random;
        random=team.random(team.playField);
        for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
        {
            if(team.playField.normalMonsters[i].numberInDeck == random)
            {
                team.changePlace(team.playField , team.hand ,team.playField.normalMonsters[i]);
            }
        }
        for(int i=0 ; i < team.playField.spellCasters.length ; i++)
        {
            if(team.playField.spellCasters[i].numberInDeck == random)
            {
                team.changePlace(team.playField , team.hand ,team.playField.spellCasters[i]);
            }
        }
        for(int i=0 ; i < team.playField.heroes.length ; i++)
        {
            if(team.playField.heroes[i].numberInDeck == random)
            {
                team.changePlace(team.playField , team.hand ,team.playField.heroes[i]);
            }
        }
        for(int i=0 ; i < team.playField.generals.length ; i++)
        {
            if(team.playField.generals[i].numberInDeck == random)
            {
                team.changePlace(team.playField , team.hand ,team.playField.generals[i]);
            }
        }
        for(int i=0 ;i<team.playField.normalMonsters.length ; i++)
        {
            team.playField.normalMonsters[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team.playField.spellCasters.length ; i++)
        {
            team.playField.spellCasters[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team.playField.generals.length ; i++)
        {
            team.playField.generals[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team.playField.heroes.length ; i++)
        {
            team.playField.heroes[i].attackPoint -= 200;
        }
    }
    public void Will(Team team)
    {
        for(int i=0 ;i<team.playField.normalMonsters.length ; i++)
        {
            team.playField.normalMonsters[i].attackPoint -= 400;
        }
        for(int i=0 ;i<team.playField.spellCasters.length ; i++)
        {
            team.playField.spellCasters[i].attackPoint -= 400;
        }
        for(int i=0 ;i<team.playField.generals.length ; i++)
        {
            team.playField.generals[i].attackPoint -= 400;
        }
        for(int i=0 ;i<team.playField.heroes.length ; i++)
        {
            team.playField.heroes[i].attackPoint -= 400;
        }
    }
}
