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


    public void catchCard(ContinuousSpell continuousSpell)
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCard(continuousSpells[0]);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }
    public void catchCard(InstantSpell instantSpell)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCard(instantSpells[0]);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCard(AuraSpell auraSpell)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCard(auraSpells[0]);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCard(NormalMonster normalMonster)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCard(normalMonsters[0]);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCard(SpellCaster spellCaster)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCard(spellCasters[0]);
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCard(General general)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCard(generals[0]);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCard( Hero hero)
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCard(heroes[0]);
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }

    public void getFirstCard(ContinuousSpell continuousSpell) {
        continuousSpells[0].catchCard(continuousSpell);
        //Hand.addCart(continuousSpells[0]);
    }
    public void getFirstCard(InstantSpell instantSpell)
    {
        instantSpells[0].catchCard(instantSpell);
        //Hand.addCart(instantSpell);
    }
    public void getFirstCard(AuraSpell auraSpell)
    {
        auraSpells[0].catchCard(auraSpell);
    }
    public void getFirstCard(NormalMonster normalMonster)
    {
        normalMonsters[0].catchCard(normalMonster);
    }
    public void getFirstCard(SpellCaster spellCaster)
    {
        spellCasters[0].catchCard(spellCaster);
    }
    public void getFirstCard(General general)
    {
        generals[0].catchCard(general);
    }
    public void getFirstCard(Hero hero)
    {
        heroes[0].catchCard(hero);
    }

    public void addCard(ContinuousSpell continuousSpell)
    {
        ContinuousSpell[] continuousSpells1=new ContinuousSpell[this.continuousSpells.length+1];
        continuousSpells1[0]=continuousSpell;
        for (int i=0 ; i<this.continuousSpells.length ; i++)
        {
            continuousSpells1[i+1]=continuousSpells[i];
        }
        continuousSpells=continuousSpells1;
    }


    public void addCard(InstantSpell instantSpell)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[this.instantSpells.length + 1];
        instantSpells1[0] = instantSpell;
        for (int i=0 ; i<=this.instantSpells.length ; i++)
        {
            instantSpells1[i+1]=instantSpells[i];
        }
        instantSpells=instantSpells1;
    }


    public  void addCard(AuraSpell auraSpell)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[this.auraSpells.length +1];
        auraSpells1[0] = auraSpell;
        for(int i=0 ; i<= this.auraSpells.length ; i++)
        {
            auraSpells1[i+1] = auraSpells[i];
        }
        auraSpells=auraSpells1;
    }


    public void addCard(NormalMonster normalMonster)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[this.normalMonsters.length + 1];
        normalMonsters1[0] = normalMonster;
        for(int i=0 ; i <= this.normalMonsters.length ; i++)
        {
            normalMonsters1[i+1] = normalMonsters[i];
        }
        normalMonsters=normalMonsters1;
    }


    public void addCard(SpellCaster spellCaster)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[this.spellCasters.length + 1];
        spellCasters1[0] = spellCaster;
        for(int i=0 ; i<= this.spellCasters.length ; i++)
        {
            spellCasters1[i+1] = spellCasters[i];
        }
        spellCasters=spellCasters1;
    }


    public void addCard(General general)
    {
        General[] generals1 = new General[this.generals.length + 1];
        generals1[0] = general;
        for( int i=0 ; i <= this.generals.length ; i++)
        {
            generals1[i+1] = generals[i];
        }
        generals=generals1;
    }
    public void addCard(Hero hero)
    {
        Hero[] heroes1 = new Hero[this.heroes.length + 1];
    }
    public void addCard()
    public void addCard()
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
