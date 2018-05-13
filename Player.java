class Player {

    protected int healthPoint;
    protected int attackPoint;
    protected int magicPoint;

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }

    public int getAttackPoint(){
        return this.attackPoint;
    }
}
