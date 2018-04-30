import java.util.Random;

public class Main {
    static boolean winner(MonsterCard tiger, MonsterCard james){
        if (tiger.attackPoint>james.healthPoint){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println(r.nextInt(5));
    }
}
