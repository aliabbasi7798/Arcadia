import java.util.ArrayList;
import java.util.Random;

class Deck
{
    ContinuousSpell[] continuousSpells=new ContinuousSpell[1];
    InstantSpell[] instantSpells=new InstantSpell[1];
    AuraSpell[] auraSpells=new AuraSpell[1];

    NormalMonster[] normalMonsters=new NormalMonster[1];
    SpellCaster[] spellCasters=new SpellCaster[1];
    General[] generals=new General[1];
    Hero[] heroes=new Hero[1];


    public void catchCard()
    {
        Card card;
        Card[] cards1 = new Card[cards.length-1];

        card = cards[0];
            cards
            getFirstCard();
            for(int i=1 ; i <= cards.length - 1 ; i++)
            {1[i-1] = cards[i];
        }
        cards = cards1;
    }

    public void getFirstCard() {
        cards[0].catchCard();
        //Hand.addCart(cards[0]);
    }

    public void addCard(Card card){
        Card[] card1=new Card[this.cards.length+1];
        card1[0]=card;
        for (int i=0 ; i<this.cards.length ; i++){
            card1[i+1]=cards[i];
        }
        cards=card1;
    }

    public void shuffle(){
        Random r=new Random();
        for (int i=0 ; i<cards.length ; i++){
            int n=r.nextInt(cards.length);
            Card temp;
            temp=cards[i];
            cards[i]=cards[n];
            cards[n]=temp;
        }
    }
}
