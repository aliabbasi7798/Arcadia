class Field {
    ContinuousSpell[] continuousSpells=new ContinuousSpell[1];
    InstantSpell[] instantSpells=new InstantSpell[1];
    AuraSpell[] auraSpells=new AuraSpell[1];

    NormalMonster[] normalMonsters=new NormalMonster[1];
    SpellCaster[] spellCasters=new SpellCaster[1];
    General[] generals=new General[1];
    Hero[] heroes=new Hero[1];


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
        getFirstCardAuraSpell();
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCardNormalMonster(Hand hand)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster();
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



    public void catchCard(ContinuousSpell continuousSpell , Hand hand )
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell(hand);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }
    public void catchCard(InstantSpell instantSpell , Hand hand)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell(hand);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCard(AuraSpell auraSpell , Hand hand)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell(hand);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCard(NormalMonster normalMonster , Hand hand)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster(hand);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCard(SpellCaster spellCaster , Hand hand)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster();
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCard(General general , Hand hand)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral(hand);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCard(Hero hero , Hand hand)
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
        //Hand.addCart(continuousSpells[0]);
    }
    public void getFirstCardInstantSpell(Hand hand) {
        //Hand.addCart(instantSpell[0]);
    }
    public void getFirstCardAuraSpell(Hand hand) {
        //Hand.addCart(auraSpell[0]);
    }
    public void getFirstCardNormalMonster(Hand hand) {
        //Hand.addCart(normalMonster[0]);
    }
    public void getFirstCardSpellCaster(Hand hand ) {
        //Hand.addCart(spellCaster[0]);
    }
    public void getFirstCardGeneral(Hand hand) {
        //Hand.addCart(general[0]);
    }
    public void getFirstCardHero(Hand hand) {
        //Hand.addCart(heros[0]);
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
        for (int i=0 ; i< this.instantSpells.length ; i++)
        {
            instantSpells1[i+1]=instantSpells[i];
        }
        instantSpells=instantSpells1;
    }


    public  void addCard(AuraSpell auraSpell)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[this.auraSpells.length +1];
        auraSpells1[0] = auraSpell;
        for(int i=0 ; i< this.auraSpells.length ; i++)
        {
            auraSpells1[i+1] = auraSpells[i];
        }
        auraSpells=auraSpells1;
    }


    public void addCard(NormalMonster normalMonster)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[this.normalMonsters.length + 1];
        normalMonsters1[0] = normalMonster;
        for(int i=0 ; i < this.normalMonsters.length ; i++)
        {
            normalMonsters1[i+1] = normalMonsters[i];
        }
        normalMonsters=normalMonsters1;
    }


    public void addCard(SpellCaster spellCaster)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[this.spellCasters.length + 1];
        spellCasters1[0] = spellCaster;
        for(int i=0 ; i< this.spellCasters.length ; i++)
        {
            spellCasters1[i+1] = spellCasters[i];
        }
        spellCasters=spellCasters1;
    }


    public void addCard(General general)
    {
        General[] generals1 = new General[this.generals.length + 1];
        generals1[0] = general;
        for(int i=0 ; i < this.generals.length ; i++)
        {
            generals1[i+1] = generals[i];
        }
        generals=generals1;
    }
    public void addCard(Hero hero)
    {
        Hero[] heroes1 = new Hero[this.heroes.length + 1];
        heroes1[0]=hero;
        for (int i=0 ; i< this.heroes.length ; i++){
            heroes1[i+1]=heroes[i];
        }
        heroes=heroes1;
    }

}