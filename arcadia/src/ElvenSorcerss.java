class ElvenSorcerss extends SpellCaster{
    public ElvenSorcerss(int num){
        this.type="12";
        this.name="Elven Sorceress";
        this.kind="Elf";
        this.attackPoint=1000;
        this.healthPoint=1000;
        this.magicPoint=7;
        this.nimble=true;
        this.defender=false;
        this.numberInDeck=num;
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
                team.changePlace(team.spellField, team.graveYard, team.spellField.auraSpells[i]);
            }
        }
        for (int i=0 ; i<team.spellField.continuousSpells.length ; i++){
            if (team.spellField.continuousSpells[i].getNumberInDeck()==a){
                team.changePlace(team.spellField, team.graveYard, team.spellField.continuousSpells[i]);
            }
        }
    }


}
