class DarkKnight extends General{

    public DarkKnight(int num){
        this.type="13";
        this.attackPoint=2500;
        this.healthPoint=2500;
        this.magicPoint=8;
        defender=false;
        nimble=false;
        name="Dark Knight";
        this.numberInDeck=num;
        this.kind="Demonic";
        this.ap=this.attackPoint;
        this.hp=this.healthPoint;
    }

    public void battleCry(Team team, NormalMonster normalMonster){
        team.changePlace(team.hand, team.graveYard, normalMonster);
    }
    public void battleCry(Team team, SpellCaster spellCaster){
        team.changePlace(team.hand, team.graveYard, spellCaster);
    }
    public void battleCry(Team team, General general){
        team.changePlace(team.hand, team.graveYard, general);
    }
    public void battleCry(Team team, Hero hero){
        team.changePlace(team.hand, team.graveYard, hero);
    }

    public void will(){
        //////player
    }
}
