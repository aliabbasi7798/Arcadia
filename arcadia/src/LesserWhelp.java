public class LesserWhelp extends NormalMonster {

    public LesserWhelp(int num){
        this.type = "11";
        this.attackPoint = 300;
        this.healthPoint = 500;
        this.magicPoint = 1;
        defender = false;
        nimble = false;
        this.numberInDeck = num;
        this.kind = "DragonBreed";
        this.name = "Lesser Whelp";

    }
}