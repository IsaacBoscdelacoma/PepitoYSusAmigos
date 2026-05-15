import java.util.Random;

public class Dau {
    static Random random = new Random();
    public static int tirar(int cares) {
        int resultat = random.nextInt(cares)+1;
        return resultat;
    }
}
