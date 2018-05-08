class OgreWarChief extends General{

    public OgreWarChief(int num){
        this.type="13";
        this.name="Ogre WarChief";
        this.kind="Ogre";
        this.attackPoint=1500;
        this.healthPoint=2500;
        this.magicPoint=7;
        this.nimble=false;
        this.defender=false;
        this.numberInDeck=num;
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void battleCry(Team team){
        for (int i = 0; i < team.playField.normalMonsters.length; i++) {
            team.playField.normalMonsters[i].changeHP(-400);
        }
        for (int i = 0; i < team.playField.spellCasters.length; i++) {
            team.playField.spellCasters[i].changeHP(-400);
        }
        for (int i = 0; i < team.playField.generals.length; i++) {
            team.playField.generals[i].changeHP(-400);
        }
        for (int i = 0; i < team.playField.heroes.length; i++) {
            team.playField.heroes[i].changeHP(-400);
        }
    }

    public void will(Team team){
        for (int i = 0; i < team.playField.normalMonsters.length; i++) {
            team.playField.normalMonsters[i].changeAP(300);
        }
        for (int i = 0; i < team.playField.spellCasters.length; i++) {
            team.playField.spellCasters[i].changeAP(300);
        }
        for (int i = 0; i < team.playField.generals.length; i++) {
            team.playField.generals[i].changeAP(300);
        }
        for (int i = 0; i < team.playField.heroes.length; i++) {
            team.playField.heroes[i].changeAP(300);
        }
    }
}
