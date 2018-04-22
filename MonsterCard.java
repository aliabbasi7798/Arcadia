abstract class MonsterCard extends Card{
    protected int healthPoint;
    protected int attackPoint;

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint(){
        return this.healthPoint;
    }

    public int getAttackPoint(){
        return this.attackPoint;
    }
}
