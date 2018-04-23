public class Main {
    static boolean winner(MonsterCard tiger, MonsterCard james){
        if (tiger.attackPoint>james.healthPoint){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        James james=new James();
        System.out.println(winner(tiger, james));
    }
}
