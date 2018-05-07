public class ArmoredDragon extends NormalMonster {
    public ArmoredDragon(int num){
        this.type = "11";
        this.attackPoint = 400;
        this.healthPoint = 2000;
        this.magicPoint = 5;
        defender = true;
        nimble = false;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Armored Dragon";
    }
}