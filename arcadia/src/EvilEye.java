class EvilEye extends SpellCaster{

    public EvilEye(int num){
        this.type="12";
        this.attackPoint=400;
        this.healthPoint=400;
        this.magicPoint=6;
        defender=false;
        nimble=false;
        name="Evil Eye";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void spell(Team team){
        for (int i = 0; i < team.playField.normalMonsters.length; i++) {
            team.playField.normalMonsters[i].changeHP(-800);
        }
        for (int i = 0; i < team.playField.spellCasters.length; i++) {
            team.playField.spellCasters[i].changeHP(-800);
        }
        for (int i = 0; i < team.playField.generals.length; i++) {
            team.playField.generals[i].changeHP(-800);
        }
        for (int i = 0; i < team.playField.heroes.length; i++) {
            team.playField.heroes[i].changeHP(-800);
        }
    }
}
