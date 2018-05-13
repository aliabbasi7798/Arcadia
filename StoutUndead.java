 class StoutUndead extends MonsterCard
 {
     public StoutUndead(int num)
     {
         this.type="11";
         this.attackPoint=600;
         this.healthPoint=1200;
         this.magicPoint=4;
         name="Stout Undead";
         nimble=false;
         defender=true;
         this.kind = "Vampiric";
         this.numberInDeck = num;
         this.ap=this.attackPoint;
         this.hp=this.healthPoint;
     }
}
