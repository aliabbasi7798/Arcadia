 class NeptuneKingofAtlantis  extends Hero
 {
     public Kraken(int num)
     {
         this.type="11";
         this.attackPoint=2500;
         this.healthPoint=2200;
         this.magicPoint=10;
         name="Neptune King of Atlantis";
         nimble=true;
         defender=false;
         this.kind = "Atlantain";
         this.numberInDeck = num;
     }
     public void BattleCry(Team team , NormalMonster normalMonster)
     {
         team.changePlace(team.hand , team.playField , normalMonster);
     }
     public void BattleCry(Team team , SpellCaster spellCaster)
     {
         team.changePlace(team.hand , team.playField , spellCaster);
     }
     public void BattleCry(Team team , General general)
     {
         team.changePlace(team.hand , team.playField , general);
     }
     public void BattleCry(Team team , Hero hero)
     {
         team.changePlace(team.hand , team.playField , hero);
     }
     public  void Spell(Team team)
     {
         int random2;
         random2=team.random(team.playField);
         for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
         {
             if(team.playField.normalMonsters[i].numberInDeck == random2)
             {
                 team.playField.normalMonsters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.spellCasters.length ; i++)
         {
             if(team.playField.spellCasters[i].numberInDeck == random2)
             {
                 team.playField.spellCasters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.heroes.length ; i++)
         {
             if(team.playField.heroes[i].numberInDeck == random2)
             {
                 team.playField.heroes[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.generals.length ; i++)
         {
             if(team.playField.generals[i].numberInDeck == random2)
             {
                 team.playField.generals[i].healthPoint -= 800;
             }
         }
         random2=team.random(team.playField);
         for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
         {
             if(team.playField.normalMonsters[i].numberInDeck == random2)
             {
                 team.playField.normalMonsters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.spellCasters.length ; i++)
         {
             if(team.playField.spellCasters[i].numberInDeck == random2)
             {
                 team.playField.spellCasters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.heroes.length ; i++)
         {
             if(team.playField.heroes[i].numberInDeck == random2)
             {
                 team.playField.heroes[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.generals.length ; i++)
         {
             if(team.playField.generals[i].numberInDeck == random2)
             {
                 team.playField.generals[i].healthPoint -= 800;
             }
         }

         random2=team.random(team.playField);
         for(int i=0 ; i < team.playField.normalMonsters.length ; i++)
         {
             if(team.playField.normalMonsters[i].numberInDeck == random2)
             {
                 team.playField.normalMonsters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.spellCasters.length ; i++)
         {
             if(team.playField.spellCasters[i].numberInDeck == random2)
             {
                 team.playField.spellCasters[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.heroes.length ; i++)
         {
             if(team.playField.heroes[i].numberInDeck == random2)
             {
                 team.playField.heroes[i].healthPoint -= 800;
             }
         }
         for(int i=0 ; i < team.playField.generals.length ; i++)
         {
             if(team.playField.generals[i].numberInDeck == random2)
             {
                 team.playField.generals[i].healthPoint -= 800;
             }
         }
     }
     public void Will(Team team1 , Team team2)
     {
         for(int i=0 ;i<team1.playField.normalMonsters.length ; i++)
         {
             team1.playField.normalMonsters[i].healthPoint -= 400;
         }
         for(int i=0 ;i<team1.playField.spellCasters.length ; i++)
         {
             team1.playField.spellCasters[i].healthPoint -= 400;
         }
         for(int i=0 ;i<team1.playField.generals.length ; i++)
         {
             team1.playField.generals[i].healthPoint -= 400;
         }
         for(int i=0 ;i<team1.playField.heroes.length ; i++)
         {
             team1.playField.heroes[i].healthPoint -= 400;
         }




         for(int i=0 ;i<team2.playField.normalMonsters.length ; i++)
         {
             team2.playField.normalMonsters[i].attackPoint += 500;
         }
         for(int i=0 ;i<team2.playField.spellCasters.length ; i++)
         {
             team2.playField.spellCasters[i].attackPoint += 500;
         }
         for(int i=0 ;i<team2.playField.generals.length ; i++)
         {
             team2.playField.generals[i].attackPoint += 500;
         }
         for(int i=0 ;i<team2.playField.heroes.length ; i++)
         {
             team2.playField.heroes[i].attackPoint += 500;
         }
     }
}
