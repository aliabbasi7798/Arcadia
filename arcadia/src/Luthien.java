class Luthien extends Hero{

    public Luthien(int num){
        this.numberInDeck=num;
        this.name="Luthien, The High Prietess";
        this.kind="Elf";
        this.healthPoint=2500;
        this.attackPoint = 2000;
        this.magicPoint = 9;
        this.nimble=false;
        this.defender=false;
        this.type="14";
    }

    public void battleCry(Team team/*own team*/){
        int b=2;
        while (b>0) {
            int a = team.random(team.playField);
            for (int i = 0; i < team.playField.normalMonsters.length; i++) {
                if (team.playField.normalMonsters[i].numberInDeck == a) {
                    team.changePlace(team.graveYard, team.hand, team.playField.normalMonsters[i]);
                }
            }
            for (int i = 0; i < team.playField.spellCasters.length; i++) {
                if (team.playField.spellCasters[i].numberInDeck == a) {
                    team.changePlace(team.graveYard, team.hand, team.playField.spellCasters[i]);
                }
            }
            for (int i = 0; i < team.playField.generals.length; i++) {
                if (team.playField.generals[i].numberInDeck == a) {
                    team.changePlace(team.graveYard, team.hand, team.playField.generals[i]);
                }
            }
            for (int i = 0; i < team.playField.heroes.length; i++) {
                if (team.playField.heroes[i].numberInDeck == a) {
                    team.changePlace(team.graveYard, team.hand, team.playField.heroes[i]);
                }
            }
            b--;
        }
    }

    public void spell(MonsterCard monsterCard){
        monsterCard.changeHP(2500);
    }

    public void will(Team team /*own*/){
        for (int i = 0 ; i < team.playField.heroes.length ; i++){
            team.playField.heroes[i].changeAP(200);
            team.playField.heroes[i].changeAP(500);
        }
        for (int i = 0 ; i < team.playField.generals.length ; i++){
            team.playField.generals[i].changeAP(200);
            team.playField.generals[i].changeAP(500);
        }
        for (int i = 0 ; i < team.playField.spellCasters.length ; i++){
            team.playField.spellCasters[i].changeAP(200);
            team.playField.spellCasters[i].changeAP(500);
        }
        for (int i = 0 ; i < team.playField.normalMonsters.length ; i++){
            team.playField.normalMonsters[i].changeAP(200);
            team.playField.normalMonsters[i].changeAP(500);
        }
    }
}
