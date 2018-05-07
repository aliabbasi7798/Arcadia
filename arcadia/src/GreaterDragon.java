public class GreaterDragon extends General {
    public GreaterDragon(int num){
        this.type="13";
        this.attackPoint=1800;
        this.healthPoint=2000;
        this.magicPoint=8;
        defender=false;
        nimble=false;
        name="Greater Dragon";
        this.numberInDeck = num;
        this.kind = "DragonBreed";
    }


    public void battleCry(Team team) {
        int a = team.random(team.playField);

        for(int i = 0 ; i < team.playField.normalMonsters.length ; i ++){
            if(team.playField.normalMonsters[i].numberInDeck == a) {
                team.playField.normalMonsters[i].changePlace(playField);
                team.playField.normalMonsters[i].changePlace(graveYard);
                team.playField.catchCardNormalMonster(team.playField.normalMonsters[i].numberInDeck);
                team.graveYard.addCard(team.playField.normalMonsters[i]);
            }
        }

        for(int i = 0 ; i < team.playField.spellCasters.length ; i ++){
            if(team.playField.spellCasters[i].numberInDeck == a) {
                team.playField.spellCasters[i].changePlace(playField);
                team.playField.spellCasters[i].changePlace(graveYard);
                team.playField.catchCardSpellCaster(team.playField.spellCasters[i].numberInDeck);
                team.graveYard.addCard(team.playField.spellCasters[i]);
            }
        }

        for(int i = 0 ; i < team.playField.heroes.length ; i ++){
            if(team.playField.heroes[i].numberInDeck == a) {
                team.playField.heroes[i].changePlace(playField);
                team.playField.heroes[i].changePlace(graveYard);
                team.playField.catchCardHero(team.playField.heroes[i].numberInDeck);
                team.graveYard.addCard(team.playField.heroes[i]);
            }
        }

        for(int i = 0 ; i < team.playField.generals.length ; i ++){
            if(team.playField.generals[i].numberInDeck == a) {
                team.playField.generals[i].changePlace(playField);
                team.playField.generals[i].changePlace(graveYard);
                team.playField.catchCardGeneral(team.playField.generals[i].numberInDeck);
                team.graveYard.addCard(team.playField.generals[i]);
            }
        }
    }


    public void will() {

    }
}