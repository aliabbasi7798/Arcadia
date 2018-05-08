class Necromancer extends SpellCaster{

    public Necromancer(int num){
        this.type="12";
        this.attackPoint=1500;
        this.healthPoint=1200;
        this.magicPoint=7;
        defender=false;
        nimble=true;
        name="Necromancer";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void spell(Team team /*own team*/){
        int a=team.random(team.graveYard);
        for (int i=0 ; i<team.graveYard.normalMonsters.length ; i++){
            if (team.graveYard.normalMonsters[i].getNumberInDeck()==a){
                team.changePlace(team.graveYard, team.hand, team.graveYard.normalMonsters[i]);
            }
        }
        for (int i=0 ; i<team.graveYard.spellCasters.length ; i++){
            if (team.graveYard.spellCasters[i].getNumberInDeck()==a){
                team.changePlace(team.graveYard, team.hand, team.graveYard.spellCasters[i]);
            }
        }
        for (int i=0 ; i<team.graveYard.generals.length ; i++){
            if (team.graveYard.generals[i].getNumberInDeck()==a){
                team.changePlace(team.graveYard, team.hand, team.graveYard.generals[i]);
            }
        }
        for (int i=0 ; i<team.graveYard.heroes.length ; i++){
            if (team.graveYard.heroes[i].getNumberInDeck()==a){
                team.changePlace(team.graveYard, team.hand, team.graveYard.heroes[i]);
            }
        }
    }
}
