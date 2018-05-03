class Hand extends Field{

    public void getFirstCardContinuousSpell() {
        continuousSpells[0].faceUp();
        //GraveYard.addCart(continuousSpells[0]);
    }
    public void getFirstCardInstantSpell() {
        instantSpells[0].faceUp();
        //PlayField.addCart(instantSpell[0]);
    }
    public void getFirstCardAuraSpell() {
        auraSpells[0].faceUp();
        //SpellField.addCart(auraSpell[0]);
    }
    public void getFirstCardNormalMonster() {
        normalMonsters[0].faceUp();
        //PlayField.addCart(normalMonster[0]);
    }
    public void getFirstCardSpellCaster() {
        spellCasters[0].faceUp();
        //PlayField.addCart(spellCaster[0]);
    }
    public void getFirstCardGeneral() {
        generals[0].faceUp();
        //PlayField.addCart(general[0]);
    }
    public void getFirstCardHero() {
        heroes[0].faceUp();
        //PlayField.addCart(heros[0]);
    }
}
