import java.util.Random;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Card card=new Card();
        ElvenDruid sd=new ElvenDruid();
        card=sd;
        System.out.println(card.name);
    }
}
