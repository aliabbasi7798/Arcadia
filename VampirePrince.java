 class VampirePrince extends General
{
    public VampirePrince(int num)
    {
        this.type="12";
        this.attackPoint=2200;
        this.healthPoint=2000;
        this.magicPoint=9;
        name="Vampire Acolyte";
        nimble=false;
        defender=false;
        this.kind = "Vampiric";
        this.numberInDeck = num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }
    public void BattleCry(Team team)
    {
        int random2;
        random2=team.random(team.playField);
        for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
        {
            if(team.playField.normalMonsters[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.normalMonsters[i]);
            }
        }
        for(int i=0 ; i < team.playField.spellCasters.length ; i++)
        {
            if(team.playField.spellCasters[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.spellCasters[i]);
            }
        }
        for(int i=0 ; i < team.playField.heroes.length ; i++)
        {
            if(team.playField.heroes[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.heroes[i]);
            }
        }
        for(int i=0 ; i < team.playField.generals.length ; i++)
        {
            if(team.playField.generals[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.generals[i]);
            }
        }
        int random2;
        random2=team.random(team.playField);
        for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
        {
            if(team.playField.normalMonsters[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.normalMonsters[i]);
            }
        }
        for(int i=0 ; i < team.playField.spellCasters.length ; i++)
        {
            if(team.playField.spellCasters[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.spellCasters[i]);
            }
        }
        for(int i=0 ; i < team.playField.heroes.length ; i++)
        {
            if(team.playField.heroes[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.heroes[i]);
            }
        }
        for(int i=0 ; i < team.playField.generals.length ; i++)
        {
            if(team.playField.generals[i].numberInDeck == random2)
            {
                team.changePlace(team.playField , team.hand , team.playField.generals[i]);
            }
        }
    }
    public void Will(Team team1 , Team team2)
    {
        for(int i=0 ;i<team1.playField.normalMonsters.length ; i++)
        {
            team1.playField.normalMonsters[i].healthPoint += 200;
        }
        for(int i=0 ;i<team1.playField.spellCasters.length ; i++)
        {
            team1.playField.spellCasters[i].healthPoint += 200;
        }
        for(int i=0 ;i<team1.playField.generals.length ; i++)
        {
            team1.playField.generals[i].healthPoint += 200;
        }
        for(int i=0 ;i<team1.playField.heroes.length ; i++)
        {
            team1.playField.heroes[i].healthPoint += 200;
        }
        for(int i=0 ;i<team2.playField.normalMonsters.length ; i++)
        {
            team2.playField.normalMonsters[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team2.playField.spellCasters.length ; i++)
        {
            team2.playField.spellCasters[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team2.playField.generals.length ; i++)
        {
            team2.playField.generals[i].attackPoint -= 200;
        }
        for(int i=0 ;i<team2.playField.heroes.length ; i++)
        {
            team2.playField.heroes[i].attackPoint -= 200;
        }
    }
}
