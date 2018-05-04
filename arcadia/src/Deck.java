import java.util.ArrayList;
import java.util.Random;

class Deck extends Field
{


    public void getFirstCardContinuousSpell(Hand hand) {
        hand.addCard(continuousSpells[0]);
        continuousSpells[0].catchCard();

    }
    public void getFirstCardInstantSpell(Hand hand) {
        hand.addCard(instantSpells[0]);
        instantSpells[0].catchCard();
    }
    public void getFirstCardAuraSpell(Hand hand) {
        hand.addCard(auraSpells[0]);
        auraSpells[0].catchCard();
    }
    public void getFirstCardNormalMonster(Hand hand) {
        hand.addCard(normalMonsters[0]);
        normalMonsters[0].catchCard();
    }
    public void getFirstCardSpellCaster(Hand hand) {
        hand.addCard(spellCasters[0]);
        spellCasters[0].catchCard();
    }
    public void getFirstCardGeneral(Hand hand) {
        hand.addCard(generals[0]);
        generals[0].catchCard();
    }
    public void getFirstCardHero(Hand hand) {
        hand.addCard(heroes[0]);
        heroes[0].catchCard();
    }
}
