public class PlayField extends Field
{
  int numberOfCards = 0;
    public void catchCardContinuousSpell( GraveYard graveYard)
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell(graveYard);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;

    }
    public void catchCardInstantSpell(GraveYard graveYard)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell(graveYard);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCardAuraSpell(GraveYard graveYard)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell(graveYard);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCardNormalMonster(GraveYard graveYard)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster(graveYard);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCardSpellCaster(GraveYard graveYard)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster(graveYard);
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCardGeneral(GraveYard graveYard)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral(graveYard);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCardHero(GraveYard graveYard)
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCardHero(graveYard);
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }



    public void catchCard(ContinuousSpell continuousSpell , GraveYard graveYard )
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell(graveYard);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }
    public void catchCard(InstantSpell instantSpell , GraveYard graveYard)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell(graveYard);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCard(AuraSpell auraSpell , GraveYard graveYard)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell(graveYard);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCard(NormalMonster normalMonster , GraveYard graveYard)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster(graveYard);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCard(SpellCaster spellCaster , GraveYard graveYard)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster(graveYard);
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCard(General general , GraveYard graveYard)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral(graveYard);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCard(Hero hero , GraveYard graveYard)
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCardHero(graveYard);
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }


    public void getFirstCardContinuousSpell(GraveYard graveYard) {
        graveYard.addCard(continuousSpells[0]);
        continuousSpells[0].death();
        //Hand.addCart(continuousSpells[0]);
    }
    public void getFirstCardInstantSpell(GraveYard graveYard) {
        graveYard.addCard(instantSpells[0]);
        instantSpells[0].death();

        //Hand.addCart(instantSpell[0]);
    }
    public void getFirstCardAuraSpell(GraveYard graveYard) {
        graveYard.addCard(auraSpells[0]);
        auraSpells[0].death();
        //Hand.addCart(auraSpell[0]);
    }
    public void getFirstCardNormalMonster(GraveYard graveYard) {
       graveYard.addCard(normalMonsters[0]);
       normalMonsters[0].death();
        //Hand.addCart(normalMonster[0]);
    }
    public void getFirstCardSpellCaster(GraveYard graveYard ) {
        graveYard.addCard(spellCasters[0]);
        spellCasters[0].death();

        //Hand.addCart(spellCaster[0]);
    }
    public void getFirstCardGeneral(GraveYard graveYard) {
        graveYard.addCard(generals[0]);
        generals[0].death();
        //Hand.addCart(general[0]);
    }
    public void getFirstCardHero(GraveYard graveYard) {
        graveYard.addCard(heroes[0]);
        heroes[0].death();
        //Hand.addCart(heros[0]);
    }
    public void addCard(ContinuousSpell continuousSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 5) {
            ContinuousSpell[] continuousSpells1 = new ContinuousSpell[this.continuousSpells.length + 1];
            continuousSpells1[0] = continuousSpell;
            for (int i = 0; i < this.continuousSpells.length; i++) {
                continuousSpells1[i + 1] = continuousSpells[i];
            }
            continuousSpells = continuousSpells1;
        }
        else
        {
            System.out.println("error");
        }
    }


    public void addCard(InstantSpell instantSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 5) {
            InstantSpell[] instantSpells1 = new InstantSpell[this.instantSpells.length + 1];
            instantSpells1[0] = instantSpell;
            for (int i = 0; i < this.instantSpells.length; i++) {
                instantSpells1[i + 1] = instantSpells[i];
            }
            instantSpells = instantSpells1;
        }
        else
        {
            System.out.println("error");
        }
    }


    public  void addCard(AuraSpell auraSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 5) {
            AuraSpell[] auraSpells1 = new AuraSpell[this.auraSpells.length + 1];
            auraSpells1[0] = auraSpell;
            for (int i = 0; i < this.auraSpells.length; i++) {
                auraSpells1[i + 1] = auraSpells[i];
            }
            auraSpells = auraSpells1;
        }
        else
        {
            System.out.println("error");
        }
    }


    public void addCard(NormalMonster normalMonster)
    {
        numberOfCards ++ ;
        if(numberOfCards <= 5) {
            normalMonster.faceUp();
            NormalMonster[] normalMonsters1 = new NormalMonster[this.normalMonsters.length + 1];
            normalMonsters1[0] = normalMonster;
            for (int i = 0; i < this.normalMonsters.length; i++) {
                normalMonsters1[i + 1] = normalMonsters[i];
            }
            normalMonsters = normalMonsters1;
        }
        else
        {
            System.out.println("error");
        }
    }


    public void addCard(SpellCaster spellCaster)
    {

        numberOfCards ++;
        if(numberOfCards <= 5)
        {
            spellCaster.faceUp();
            SpellCaster[] spellCasters1 = new SpellCaster[this.spellCasters.length + 1];
            spellCasters1[0] = spellCaster;
            for(int i=0 ; i< this.spellCasters.length ; i++)
            {
                spellCasters1[i+1] = spellCasters[i];
            }
            spellCasters=spellCasters1;
            }
            else
            {
               System.out.println("error");
            }
    }


    public void addCard(General general)
    {

        numberOfCards ++;
        if(numberOfCards<= 5) {
            general.faceUp();
            General[] generals1 = new General[this.generals.length + 1];
            generals1[0] = general;
            for (int i = 0; i < this.generals.length; i++) {
                generals1[i + 1] = generals[i];
            }
            generals = generals1;
        }
        else
        {
            System.out.println("error");
        }
    }
    public void addCard(Hero hero)
    {
        numberOfCards ++;
        if(numberOfCards <= 5) {
            hero.faceUp();

            Hero[] heroes1 = new Hero[this.heroes.length + 1];
            heroes1[0] = hero;
            for (int i = 0; i < this.heroes.length; i++) {
                heroes1[i + 1] = heroes[i];
            }
            heroes = heroes1;
        }
        else
        {
            System.out.println("error");
        }
    }
}
