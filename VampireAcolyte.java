 class VampireAcolyte extends SpellCaster
 {
     public VampireAcolyte(int num)
     {
         this.type="12";
         this.attackPoint=1500;
         this.healthPoint=1500;
         this.magicPoint=7;
         name="Vampire Acolyte";
         nimble=true;
         defender=false;
         this.kind = "Vampiric";
         this.numberInDeck = num;
         this.ap=this.attackPoint;
         this.hp=this.healthPoint;
     }
     public  void Spell(Team team1 , Team team2)
     {
         for(int i=0 ;i<team1.playField.normalMonsters.length ; i++)
         {
             team1.playField.normalMonsters[i].healthPoint += 300;
         }
         for(int i=0 ;i<team1.playField.spellCasters.length ; i++)
         {
             team1.playField.spellCasters[i].healthPoint += 300;
         }
         for(int i=0 ;i<team1.playField.generals.length ; i++)
         {
             team1.playField.generals[i].healthPoint += 300;
         }
         for(int i=0 ;i<team1.playField.heroes.length ; i++)
         {
             team1.playField.heroes[i].healthPoint += 300;
         }
         for(int i=0 ;i<team2.playField.normalMonsters.length ; i++)
         {
             team2.playField.normalMonsters[i].healthPoint -= 300;
         }
         for(int i=0 ;i<team2.playField.spellCasters.length ; i++)
         {
             team2.playField.spellCasters[i].healthPoint -= 300;
         }
         for(int i=0 ;i<team2.playField.generals.length ; i++)
         {
             team2.playField.generals[i].healthPoint -= 300;
         }
         for(int i=0 ;i<team2.playField.heroes.length ; i++)
         {
             team2.playField.heroes[i].healthPoint -= 300;
         }
     }

}
