class Hand extends Field{


    public void catchCard(ContinuousSpell continuousSpell ,SpellField spellField)
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell(spellField);
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }

    public void catchCard(InstantSpell instantSpell ,GraveYard graveYard)
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell(graveYard);
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }

    public void catchCard(AuraSpell auraSpell ,SpellField spellField)
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell(spellField);
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }

    public void catchCard(NormalMonster normalMonster ,PlayField playField)
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster(playField);
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }

    public void catchCard(SpellCaster spellCaster ,PlayField playField)
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster(playField);
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }

    public void catchCard(General general ,PlayField playField)
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral(playField);
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }

     public void catchCard(Hero hero ,PlayField playField)
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCardHero(playField);
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }




    public void getFirstCardContinuousSpell(SpellField spellField) {
        continuousSpells[0].faceUp();
        spellField.addCard(continuousSpells[0]);
    }
    public void getFirstCardInstantSpell(GraveYard graveYard) {
        instantSpells[0].faceUp();
        graveYard.addCard(instantSpells[0]);
    }
    public void getFirstCardAuraSpell(SpellField spellField) {
        auraSpells[0].faceUp();
        spellField.addCard(auraSpells[0]);
    }
    public void getFirstCardNormalMonster(PlayField playField) {
        normalMonsters[0].faceUp();
        playField.addCard(normalMonsters[0]);
    }
    public void getFirstCardSpellCaster(PlayField playField) {
        spellCasters[0].faceUp();
        playField.addCard(spellCasters[0]);
    }
    public void getFirstCardGeneral(PlayField playField) {
        generals[0].faceUp();
        playField.addCard(generals[0]);
    }
    public void getFirstCardHero(PlayField playField) {
        heroes[0].faceUp();
        playField.addCard(heroes[0]);
    }
}
