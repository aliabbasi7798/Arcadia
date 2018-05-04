public class VolcanicDragon extends SpellCaster {
    public VolcanicDragon(int num){
        this.type = "12";
        this.attackPoint = 700;
        this.healthPoint = 2500;
        this.magicPoint = 8;
        defender = true;
        nimble = false;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Volcanic Dragon";
    }


    public void spell(MonsterCard monsterCard) {
        monsterCard.attackPoint -= 500;
        monsterCard.healthPoint -= 500;
    }
}
