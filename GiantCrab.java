 class GiantCrab extends MonsterCard
 {
     public GiantCrab(int num)
     {
         this.type="11";
         this.attackPoint=300;
         this.healthPoint=1500;
         this.magicPoint=4;
         name="Giant Crab";
         nimble=false;
         defender=true;
         this.kind = "Atlantain";
         this.numberInDeck = num;
         this.ap=this.attackPoint;
         this.hp=this.healthPoint;
     }
}
