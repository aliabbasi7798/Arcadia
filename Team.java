class Team {
    Hand hand=new Hand();
    Deck deck=new Deck();
    GraveYard graveYard=new GraveYard();
    PlayField playField=new PlayField();
    SpellField spellField=new SpellField();

    private boolean turn=false;
    private int magicPoint=0;

    public int getMagicPoint() {
        return magicPoint;
    }

    public boolean getTurn(){
        return turn;
    }

    public void addMagicPoint(){
        magicPoint++;
    }

    public void switchTurn(){
        if (turn){
            turn=false;
        }
        else {
            turn=true;
        }
    }


}
