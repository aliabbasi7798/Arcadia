class NobleElf extends General{

    public NobleElf(int number){
        this.type="13";
        this.name="Noble Elf";
        this.kind="Elf";
        this.attackPoint=2400;
        this.healthPoint=2000;
        this.magicPoint=9;
        this.nimble=false;
        this.defender=false;
        this.numberInDeck=number;
    }

    public void battleCry(Team team){
        for (int i = 0 ; i < team.playField.heroes.length ; i++){
            team.changePlace(team.playField, team.hand, team.playField.heroes[i]);
        }
        for (int i = 0 ; i < team.playField.generals.length ; i++){
            team.changePlace(team.playField, team.hand, team.playField.generals[i]);
        }
        for (int i = 0 ; i < team.playField.spellCasters.length ; i++){
            team.changePlace(team.playField, team.hand, team.playField.spellCasters[i]);
        }
        for (int i = 0 ; i < team.playField.normalMonsters.length ; i++){
            team.changePlace(team.playField, team.hand, team.playField.normalMonsters[i]);
        }

    }

    public void will(Team team){
        int a=team.random(team.playField);
        for (int i = 0 ; i < team.playField.normalMonsters.length ; i++){
            if (team.playField.normalMonsters[i].numberInDeck==a){
                team.playField.normalMonsters[i].setHealthPoint(team.playField.normalMonsters[i].getHealthPoint() + 800);
                team.playField.normalMonsters[i].setAttackPoint(team.playField.normalMonsters[i].getAttackPoint() + 600);
            }
        }
        for (int i = 0 ; i < team.playField.spellCasters.length ; i++){
            if (team.playField.spellCasters[i].numberInDeck==a){
                team.playField.spellCasters[i].setHealthPoint(team.playField.spellCasters[i].getHealthPoint() + 800);
                team.playField.spellCasters[i].setAttackPoint(team.playField.spellCasters[i].getAttackPoint() + 600);
            }
        }
        for (int i = 0 ; i < team.playField.generals.length ; i++){
            if (team.playField.generals[i].numberInDeck==a){
                team.playField.generals[i].setHealthPoint(team.playField.generals[i].getHealthPoint() + 800);
                team.playField.generals[i].setAttackPoint(team.playField.generals[i].getAttackPoint() + 600);
            }
        }
        for (int i = 0 ; i < team.playField.normalMonsters.length ; i++){
            if (team.playField.normalMonsters[i].numberInDeck==a){
                team.playField.normalMonsters[i].setHealthPoint(team.playField.normalMonsters[i].getHealthPoint() + 800);
                team.playField.normalMonsters[i].setAttackPoint(team.playField.normalMonsters[i].getAttackPoint() + 600);
            }
        }


    }
}
