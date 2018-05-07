public class Igneel extends Hero {

    public Igneel(int num){
        this.type="14";
        this.attackPoint=800;
        this.healthPoint=4000;
        this.magicPoint=10;
        defender=false;
        nimble=false;
        name="Igneel, the Dragon King";
        this.numberInDeck = num;
        this.kind = "DragonBreed";
    }


    public void battleCry() {

    }
}