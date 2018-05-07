class ElvenSorcerss extends SpellCaster{
    public ElvenSorcerss(){
        this.type="12";
        this.name="Elven Sorceress";
        this.attackPoint=1000;
        this.healthPoint=1000;
        this.magicPoint=7;
        this.nimble=true;
        this.defender=false;
    }

    public void spell(Team team) {
        for (int i = 0; i < team.playField.normalMonsters.length; i++) {
            team.playField.normalMonsters[i].setHealthPoint(team.playField.normalMonsters[i].getHealthPoint()-400);
        }
        for (int i = 0; i < team.playField.spellCasters.length; i++) {
            team.playField.spellCasters[i].setHealthPoint(team.playField.spellCasters[i].getHealthPoint()-400);
        }
        for (int i = 0; i < team.playField.generals.length; i++) {
            team.playField.generals[i].setHealthPoint(team.playField.generals[i].getHealthPoint()-400);
        }
        for (int i = 0; i < team.playField.heroes.length; i++) {
            team.playField.heroes[i].setHealthPoint(team.playField.heroes[i].getHealthPoint()-400);
        }
        int a=team.random(team.spellField);
        for (int i=0 ; i<team.spellField.auraSpells.length ; i++){
            if (team.spellField.auraSpells[i].getNumberInDeck()==a){
                team.spellField.auraSpells[i].changePlace(team.spellField.auraSpells[i].spellField);
                team.spellField.auraSpells[i].changePlace(team.spellField.auraSpells[i].graveYard);
                team.spellField.catchCardAuraSpell(a);
                team.graveYard.addCard(team.spellField.auraSpells[i]);
            }
        }
        for (int i=0 ; i<team.spellField.continuousSpells.length ; i++){
            if (team.spellField.continuousSpells[i].getNumberInDeck()==a){
                team.spellField.continuousSpells[i].changePlace(team.spellField.continuousSpells[i].spellField);
                team.spellField.continuousSpells[i].changePlace(team.spellField.continuousSpells[i].graveYard);
                team.spellField.catchCardAuraSpell(a);
                team.graveYard.addCard(team.spellField.continuousSpells[i]);
            }
        }
    }


}
