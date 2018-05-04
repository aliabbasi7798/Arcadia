class PlayField extends Field
{
    int numberOfCards = 0;



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
            numberOfCards--;
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
            numberOfCards--;
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
            numberOfCards--;
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
            numberOfCards--;
        }
    }
}