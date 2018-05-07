class Hand extends Field{


    public void catchCard(ContinuousSpell continuousSpell ,SpellField spellField)
    {
        int numberOfCard ;
        for(int i =0 ;i< continuousSpells.length ; i++)
        {
            if(continuousSpell.numberInDeck == continuousSpells[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            continuousSpells1[i]=continuousSpells[i];
        }
        for(int i=numberOfCard +1 ; i<continuousSpells.length ; i++)
        {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }

    public void catchCard(InstantSpell instantSpell ,GraveYard graveYard)
    {
        int numberOfCard;
        for(int i=0 ; i<instantSpells.length ; i++)
        {
            if(instantSpell.numberInDeck == instantSpells[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        //getFirstCardInstantSpell();
        for(int i=0 ; i < numberOfCard ; i++) {
            instantSpells1[i]=instantSpells[i];
        }
        for(int i=numberOfCard+1 ; i<instantSpells.length;i++) {
            instantSpells[i] = instantSpells1[i+1];
        }
        instantSpells = instantSpells1;
    }

    public void catchCard(AuraSpell auraSpell ,SpellField spellField)
    {
        int numberOfCard ;
        for(int i =0 ;i< auraSpells.length ; i++)
        {
            if(auraSpell.numberInDeck == auraSpells[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            auraSpells1[i]=auraSpells[i];
        }
        for(int i=numberOfCard +1 ; i<auraSpells.length ; i++)
        {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells=auraSpells1;
    }

    public void catchCard(NormalMonster normalMonster ,PlayField playField)
    {
        int numberOfCard ;
        for(int i =0 ;i< normalMonsters.length ; i++)
        {
            if(normalMonster.numberInDeck == normalMonsters[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            normalMonsters1[i]=normalMonsters[i];
        }
        for(int i=numberOfCard +1 ; i<normalMonsters.length ; i++)
        {
            normalMonsters1[i]=normalMonsters[i+1];
        }
        normalMonsters=normalMonsters1;
    }

    public void catchCard(SpellCaster spellCaster ,PlayField playField)
    {
        int numberOfCard ;
        for(int i =0 ;i< spellCasters.length ; i++)
        {
            if(spellCaster.numberInDeck == spellCasters[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            spellCasters1[i]=spellCasters[i];
        }
        for(int i=numberOfCard +1 ; i<spellCasters.length ; i++)
        {
            spellCasters1[i]=spellCasters[i+1];
        }
        spellCasters=spellCasters1;
    }

    public void catchCard(General general ,PlayField playField)
    {  int numberOfCard ;
        for(int i =0 ;i< generals.length ; i++)
        {
            if(general.numberInDeck == generals[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        General[] generals1 = new General[generals.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            generals1[i]=generals[i];
        }
        for(int i=numberOfCard +1 ; i<generals.length ; i++)
        {
            generals1[i]=generals[i+1];
        }
        generals=generals1;
    }

     public void catchCard(Hero hero ,PlayField playField)
    {
        int numberOfCard ;
        for(int i =0 ;i< heroes.length ; i++)
        {
            if(hero.numberInDeck == heroes[i].numberInDeck)
            {
                numberOfCard=i;
                break;
            }
        }
        Hero[] heroes1 = new Hero[heroes.length-1];

        //getFirstCardContinuousSpell();
        for(int i=0 ; i < numberOfCard; i++)
        {
            heroes1[i]=heroes[i];
        }
        for(int i=numberOfCard +1 ; i<heroes.length ; i++)
        {
            heroes1[i]=heroes[i+1];
        }
        heroes=heroes1;

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
