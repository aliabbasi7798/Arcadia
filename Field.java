import
class Field {
    ContinuousSpell[] continuousSpells=new ContinuousSpell[1];
    InstantSpell[] instantSpells=new InstantSpell[1];
    AuraSpell[] auraSpells=new AuraSpell[1];

    NormalMonster[] normalMonsters=new NormalMonster[1];
    SpellCaster[] spellCasters=new SpellCaster[1];
    General[] generals=new General[1];
    Hero[] heroes=new Hero[1];

    public int[] random(int continuousSpells , int instantSpells , int auraSpells , int  normalMonsters , int spellCasters ,int  generals , int heroes)
    {
        int
        int number1 = 0;
        number1 += continuousSpells;
        int number2 = number1+instantSpells;
        int number3 = number2+auraSpells;
        int number4 = number3+normalMonsters;
        int number5 = number4+spellCasters;
        int number6 = number5+generals;
        int number7 =  number6+heroes;
        Random rnd = new Random();
        int number = rnd.nextInt(number7)+1;
        if(number >= 1 && number <=number1)
        {

        }
        else if(number> number1 && number <= number2)
        {

        }
        else if(number > number2 && number <= number3)
        {

        }
        else if(number > number3 && number <= number4)
        {

        }
        else if(number >number4 && number <= number5)
        {

        }
        else if(number > number5 && number <= number6)
        {

        }
        else
        {

        }

    }
    public void catchCardContinuousSpell()
    {
        ContinuousSpell[] continuousSpells1 = new ContinuousSpell[continuousSpells.length-1];

        getFirstCardContinuousSpell();
        for(int i=0 ; i <= continuousSpells.length - 2 ; i++) {
            continuousSpells1[i]=continuousSpells[i+1];
        }
        continuousSpells=continuousSpells1;
    }
    public void catchCardInstantSpell()
    {
        InstantSpell[] instantSpells1 = new InstantSpell[instantSpells.length-1];

        getFirstCardInstantSpell();
        for(int i=0 ; i <= instantSpells.length - 2 ; i++) {
            instantSpells1[i]=instantSpells[i+1];
        }
        instantSpells=instantSpells1;
    }
    public void catchCardAuraSpell()
    {
        AuraSpell[] auraSpells1 = new AuraSpell[auraSpells.length - 1];
        getFirstCardAuraSpell();
        for(int i=0 ; i <= auraSpells.length - 2 ; i++) {
            auraSpells1[i]=auraSpells[i+1];
        }
        auraSpells = auraSpells1;
    }
    public void catchCardNormalMonster()
    {
        NormalMonster[] normalMonsters1 = new NormalMonster[normalMonsters.length - 1];
        getFirstCardNormalMonster();
        for( int i=0 ; i <= normalMonsters.length - 2 ; i++)
        {
            normalMonsters1[i] = normalMonsters[i+1];
        }
        normalMonsters = normalMonsters1;
    }
    public void catchCardSpellCaster()
    {
        SpellCaster[] spellCasters1 = new SpellCaster[spellCasters.length - 1];
        getFirstCardSpellCaster();
        for(int i =0 ; i <= spellCasters.length - 2 ; i++)
        {
            spellCasters1[i] = spellCasters[i+1];
        }
        spellCasters = spellCasters1;
    }
    public void catchCardGeneral()
    {
        General[] generals1 = new General[generals.length - 1];
        getFirstCardGeneral();
        for( int i=0 ; i <= generals.length - 2 ; i++ )
        {
            generals1[i] = generals[i+1];
        }
        generals = generals1;
    }
    public void catchCardHero()
    {
        Hero[] heroes1 = new Hero[heroes.length - 1 ];
        getFirstCardHero();
        for( int i=0 ; i <= heroes.length -  2  ; i++)
        {
            heroes1[i] = heroes[i+1];
        }
        heroes = heroes1;

    }



    public void catchCard(ContinuousSpell continuousSpell)
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
    public void catchCard(InstantSpell instantSpell)
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
    public void catchCard(AuraSpell auraSpell)
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
    public void catchCard(NormalMonster normalMonster)
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
    public void catchCard(SpellCaster spellCaster)
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
    public void catchCard(General general)
    {
        int numberOfCard ;
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
    public void catchCard(Hero hero)
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
