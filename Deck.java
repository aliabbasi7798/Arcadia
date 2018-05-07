import java.util.ArrayList;
import java.util.Random;

class Deck extends Field
{



    public void catchCardContinuousSpell( Hand hand)
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell(hand);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;

    }
    public void catchCardInstantSpell(Hand hand)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell(hand);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCardAuraSpell(Hand hand)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell(hand);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCardNormalMonster(Hand hand)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster(hand);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCardSpellCaster(Hand hand)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster(hand);
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCardGeneral(Hand hand)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral(hand);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCardHero(Hand hand)
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCardHero(hand);
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }




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
