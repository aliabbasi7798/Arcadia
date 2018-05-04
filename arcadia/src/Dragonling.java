public class Dragonling extends NormalMonster {

    public Dragonling(int num){
        this.type = "11";
        this.attackPoint = 700;
        this.healthPoint = 700;
        this.magicPoint = 3;
        defender = false;
        nimble = false;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Dragonling";
    }
}
