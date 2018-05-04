class General extends MonsterCard{

    public void faceUp() {
        changePlace(hand);
        battleCry();
        changePlace(graveYard);
    }

    public void death(){  /*when monstercard die*/
        changePlace(playField);
        will();
        changePlace(graveYard);
    }

    public void battleCry(){//do a magical work when entered

    }

    public void will(){//do a magical work when exited

    }
}
