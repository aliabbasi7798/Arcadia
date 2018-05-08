class Cerberus extends Hero{

    public Cerberus(int num){
        this.type="14";
        this.attackPoint=2000;
        this.healthPoint=3000;
        this.magicPoint=10;
        defender=false;
        nimble=true;
        name="Cerberus, GateKeeper Of Hell";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void battleCry(){

    }

    public void spll(Team own, Team enemy){
        for (int i = 0; i < enemy.playField.normalMonsters.length; i++) {
            enemy.playField.normalMonsters[i].changeHP(-300);
        }
        for (int i = 0; i < enemy.playField.spellCasters.length; i++) {
            enemy.playField.spellCasters[i].changeHP(-300);
        }
        for (int i = 0; i < enemy.playField.generals.length; i++) {
            enemy.playField.generals[i].changeHP(-300);
        }
        for (int i = 0; i < enemy.playField.heroes.length; i++) {
            enemy.playField.heroes[i].changeHP(-300);
        }

        for (int i = 0 ; i < own.playField.normalMonsters.length ; i++){
            own.playField.normalMonsters[i].changeHP(300);
            own.playField.normalMonsters[i].changeAP(300);
        }
        for (int i = 0 ; i < own.playField.spellCasters.length ; i++){
            own.playField.spellCasters[i].changeHP(300);
            own.playField.spellCasters[i].changeAP(300);
        }
        for (int i = 0 ; i < own.playField.generals.length ; i++){
            own.playField.generals[i].changeHP(300);
            own.playField.generals[i].changeAP(300);
        }
        for (int i = 0 ; i < own.playField.heroes.length ; i++){
            own.playField.heroes[i].changeHP(300);
            own.playField.heroes[i].changeAP(300);
        }

    }


    public void will(Team team){
        int count=2;
        while (count>0){
            int a=team.random(team.playField);
            for (int i=0 ; i<team.playField.normalMonsters.length ; i++){
                if (team.playField.normalMonsters[i].getNumberInDeck()==a){
                    team.changePlace(team.playField, team.graveYard, team.playField.normalMonsters[i]);
                }
            }
            for (int i=0 ; i<team.playField.spellCasters.length ; i++){
                if (team.playField.spellCasters[i].getNumberInDeck()==a){
                    team.changePlace(team.playField, team.graveYard, team.playField.spellCasters[i]);
                }
            }
            for (int i=0 ; i<team.playField.generals.length ; i++){
                if (team.playField.generals[i].getNumberInDeck()==a){
                    team.changePlace(team.playField, team.graveYard, team.playField.generals[i]);
                }
            }
            for (int i=0 ; i<team.playField.heroes.length ; i++){
                if (team.playField.heroes[i].getNumberInDeck()==a){
                    team.changePlace(team.playField, team.graveYard, team.playField.heroes[i]);
                }
            }
            count--;
        }
    }
}
