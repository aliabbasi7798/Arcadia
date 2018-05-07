class SpellField extends Field{
    private int numberOfCards;
    public void addCard(ContinuousSpell continuousSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 3) {
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
            numberOfCards--;
        }
    }


    public void addCard(InstantSpell instantSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 3) {
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
            numberOfCards--;
        }
    }


    public  void addCard(AuraSpell auraSpell)
    {
        numberOfCards ++;
        if(numberOfCards <= 3) {
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
            numberOfCards--;
        }
    }








}
