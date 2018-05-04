public class BlueDragon extends SpellCaster {
    public BlueDragon(int num){
        this.type = "12";
        this.attackPoint = 1200;
        this.healthPoint = 800;
        this.magicPoint = 5;
        defender = false;
        nimble = false;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Blue Dragon";
    }


    public void spell(MonsterCard monsterCard) {
        monsterCard.changePlace(playField);
        monsterCard.changePlace(graveYard);
    }

}
