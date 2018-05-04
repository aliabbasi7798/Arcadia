import java.util.Random;
class Team {
    Hand hand=new Hand();
    Deck deck=new Deck();
    GraveYard graveYard=new GraveYard();
    PlayField playField=new PlayField();
    SpellField spellField=new SpellField();
    public int random(Hand hand)
    {
        int number1 = 0;
        number1 += hand.continuousSpells.length;
        int number2 = number1+hand.instantSpells.length;
        int number3 = number2+hand.auraSpells.length;
        int number4 = number3+hand.normalMonsters.length;
        int number5 = number4+hand.spellCasters.length;
        int number6 = number5+hand.generals.length;
        int number7 =  number6+hand.heroes.length;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {
            return hand.continuousSpells[number-1].numberInDeck;
        }
        else if(number> number1 && number <= number2)
        {
            return hand.instantSpells[number-number1-1].numberInDeck;
        }
        else if(number > number2 && number <= number3)
        {
            return hand.auraSpells[number-number2-1].numberInDeck;
        }
        else if(number > number3 && number <= number4)
        {
            return hand.normalMonsters[number-number3-1].numberInDeck;
        }
        else if(number >number4 && number <= number5)
        {
            return hand.spellCasters[number-number4-1].numberInDeck;
        }
        else if(number > number5 && number <= number6)
        {
            return hand.generals[number-number5-1].numberInDeck;
        }
        else
        {
            return hand.heroes[number-number6-1].numberInDeck;
        }

    }
    public int random(GraveYard graveYard)
    {
        int number1 = 0;
        number1 += graveYard.continuousSpells.length;
        int number2 = number1+graveYard.instantSpells.length;
        int number3 = number2+graveYard.auraSpells.length;
        int number4 = number3+graveYard.normalMonsters.length;
        int number5 = number4+graveYard.spellCasters.length;
        int number6 = number5+graveYard.generals.length;
        int number7 =  number6+graveYard.heroes.length;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {
            return graveYard.continuousSpells[number-1].numberInDeck;
        }
        else if(number> number1 && number <= number2)
        {
            return graveYard.instantSpells[number-number1-1].numberInDeck;
        }
        else if(number > number2 && number <= number3)
        {
            return graveYard.auraSpells[number-number2-1].numberInDeck;
        }
        else if(number > number3 && number <= number4)
        {
            return graveYard.normalMonsters[number-number3-1].numberInDeck;
        }
        else if(number >number4 && number <= number5)
        {
            return graveYard.spellCasters[number-number4-1].numberInDeck;
        }
        else if(number > number5 && number <= number6)
        {
            return graveYard.generals[number-number5-1].numberInDeck;
        }
        else
        {
            return graveYard.heroes[number-number6-1].numberInDeck;
        }

    }
    public int random(Deck deck)
    {
        int number1 = 0;
        number1 += deck.continuousSpells.length;
        int number2 = number1+deck.instantSpells.length;
        int number3 = number2+deck.auraSpells.length;
        int number4 = number3+deck.normalMonsters.length;
        int number5 = number4+deck.spellCasters.length;
        int number6 = number5+deck.generals.length;
        int number7 =  number6+deck.heroes.length;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {
            return deck.continuousSpells[number-1].numberInDeck;
        }
        else if(number> number1 && number <= number2)
        {
            return deck.instantSpells[number-number1-1].numberInDeck;
        }
        else if(number > number2 && number <= number3)
        {
            return deck.auraSpells[number-number2-1].numberInDeck;
        }
        else if(number > number3 && number <= number4)
        {
            return deck.normalMonsters[number-number3-1].numberInDeck;
        }
        else if(number >number4 && number <= number5)
        {
            return deck.spellCasters[number-number4-1].numberInDeck;
        }
        else if(number > number5 && number <= number6)
        {
            return deck.generals[number-number5-1].numberInDeck;
        }
        else
        {
            return deck.heroes[number-number6-1].numberInDeck;
        }

    }
    public int random(PlayField playField)
    {
        int number1 = 0;
        number1 += playField.continuousSpells.length;
        int number2 = number1+playField.instantSpells.length;
        int number3 = number2+playField.auraSpells.length;
        int number4 = number3+playField.normalMonsters.length;
        int number5 = number4+playField.spellCasters.length;
        int number6 = number5+playField.generals.length;
        int number7 =  number6+playField.heroes.length;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {
            return playField.continuousSpells[number-1].numberInDeck;
        }
        else if(number> number1 && number <= number2)
        {
            return playField.instantSpells[number-number1-1].numberInDeck;
        }
        else if(number > number2 && number <= number3)
        {
            return playField.auraSpells[number-number2-1].numberInDeck;
        }
        else if(number > number3 && number <= number4)
        {
            return playField.normalMonsters[number-number3-1].numberInDeck;
        }
        else if(number >number4 && number <= number5)
        {
            return playField.spellCasters[number-number4-1].numberInDeck;
        }
        else if(number > number5 && number <= number6)
        {
            return playField.generals[number-number5-1].numberInDeck;
        }
        else
        {
            return playField.heroes[number-number6-1].numberInDeck;
        }

    }
    public int random(SpellField spellField)
    {
        int number1 = 0;
        number1 += spellField.continuousSpells.length;
        int number2 = number1+spellField.instantSpells.length;
        int number3 = number2+spellField.auraSpells.length;
        int number4 = number3+spellField.normalMonsters.length;
        int number5 = number4+spellField.spellCasters.length;
        int number6 = number5+spellField.generals.length;
        int number7 =  number6+spellField.heroes.length;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {
            return spellField.continuousSpells[number-1].numberInDeck;
        }
        else if(number> number1 && number <= number2)
        {
            return spellField.instantSpells[number-number1-1].numberInDeck;
        }
        else if(number > number2 && number <= number3)
        {
            return spellField.auraSpells[number-number2-1].numberInDeck;
        }
        else if(number > number3 && number <= number4)
        {
            return spellField.normalMonsters[number-number3-1].numberInDeck;
        }
        else if(number >number4 && number <= number5)
        {
            return spellField.spellCasters[number-number4-1].numberInDeck;
        }
        else if(number > number5 && number <= number6)
        {
            return spellField.generals[number-number5-1].numberInDeck;
        }
        else
        {
            return spellField.heroes[number-number6-1].numberInDeck;
        }

    }
    private boolean turn=false;
    private int magicPoint=0;

    public int getMagicPoint() {
        return magicPoint;
    }

    public boolean getTurn(){
        return turn;
    }

    public void addMagicPoint(){
        magicPoint++;
    }

    public void switchTurn(){
        if (turn){
            turn=false;
        }
        else {
            turn=true;
        }
    }


}