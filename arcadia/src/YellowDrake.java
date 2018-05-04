public class YellowDrake extends NormalMonster {
    public YellowDrake(int num){
        this.type = "11";
        this.attackPoint = 1000;
        this.healthPoint = 800;
        this.magicPoint = 5;
        defender = false;
        nimble = true;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Yellow Drake";
    }
}
