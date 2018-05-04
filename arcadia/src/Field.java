class Field {
    ContinuousSpell[] continuousSpells=new ContinuousSpell[1];
    InstantSpell[] instantSpells=new InstantSpell[1];
    AuraSpell[] auraSpells=new AuraSpell[1];

    NormalMonster[] normalMonsters=new NormalMonster[1];
    SpellCaster[] spellCasters=new SpellCaster[1];
    General[] generals=new General[1];
    Hero[] heroes=new Hero[1];


    public void catchCardContinuousSpell(int num)
    {
        for(int i = 0 ; i < continuousSpells.length; i ++){
            if(continuousSpells[i].numberInDeck == num){
                continuousSpells[i].changePlace(continuousSpells[i].spellField);
                for(int j = i + 1 ; j < continuousSpells.length; i ++){
                    continuousSpells[j-1] = continuousSpells[j];
                }
                ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length - 1];
                continuousSpells = continuousSpells1;
            }
        }
    }
    public void catchCardInstantSpell(int num)
    {
        for(int i = 0 ; i < instantSpells.length; i ++){
            if(instantSpells[i].numberInDeck == num){
                instantSpells[i].changePlace(instantSpells[i].spellField);
                for(int j = i + 1 ; j < instantSpells.length; i ++){
                    instantSpells[j-1] = instantSpells[j];
                }
                InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length - 1];
                instantSpells = instantSpells1;
            }
        }
    }
    public void catchCardAuraSpell(int num)
    {
        for(int i = 0 ; i < auraSpells.length; i ++){
            if(auraSpells[i].numberInDeck == num){
                auraSpells[i].changePlace(auraSpells[i].spellField);
                for(int j = i + 1 ; j < auraSpells.length; i ++){
                    auraSpells[j-1] = auraSpells[j];
                }
                AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
                auraSpells = auraSpells1;
            }
        }
    }
    public void catchCardNormalMonster(int num)
    {
        for(int i = 0 ; i < normalMonsters.length; i ++){
            if(normalMonsters[i].numberInDeck == num){
                normalMonsters[i].changePlace(normalMonsters[i].playField);
                for(int j = i + 1 ; j < normalMonsters.length; i ++){
                    normalMonsters[j-1] = normalMonsters[j];
                }
                NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
                normalMonsters = normalMonsters1;
            }
        }
    }
    public void catchCardSpellCaster(int num)
    {
        for(int i = 0 ; i < spellCasters.length; i ++){
            if(spellCasters[i].numberInDeck == num){
                spellCasters[i].changePlace(spellCasters[i].playField);
                for(int j = i + 1 ; j < spellCasters.length; i ++){
                    spellCasters[j-1] = spellCasters[j];
                }
                SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
                spellCasters = spellCasters1;
            }
        }
    }
    public void catchCardGeneral(int num)
    {
        for(int i = 0 ; i < generals.length; i ++){
            if(generals[i].numberInDeck == num){
                generals[i].changePlace(generals[i].playField);
                for(int j = i + 1 ; j < generals.length; i ++){
                    generals[j-1] = generals[j];
                }
                General[] generals1 = new General[generals.length - 1];
                generals = generals1;
            }
        }
    }
    public void catchCardHero(int num)
    {
        for(int i = 0 ; i < heroes.length; i ++){
            if(heroes[i].numberInDeck == num){
                heroes[i].changePlace(heroes[i].playField);
                for(int j = i + 1 ; j < auraSpells.length; i ++){
                    heroes[j-1] = heroes[j];
                }
                Hero[] heroes1 = new Hero[heroes.length - 1];
                heroes = heroes1;
            }
        }
    }

    public void getFirstCardContinuousSpell() {
        //Hand.addCart(continuousSpells[0]);
    }
    public void getFirstCardInstantSpell() {
        //Hand.addCart(instantSpell[0]);
    }
    public void getFirstCardAuraSpell() {
        //Hand.addCart(auraSpell[0]);
    }
    public void getFirstCardNormalMonster() {
        //Hand.addCart(normalMonster[0]);
    }
    public void getFirstCardSpellCaster() {
        //Hand.addCart(spellCaster[0]);
    }
    public void getFirstCardGeneral() {
        //Hand.addCart(general[0]);
    }
    public void getFirstCardHero() {
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
