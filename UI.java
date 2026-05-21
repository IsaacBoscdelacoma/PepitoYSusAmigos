import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private static Scanner entrada = new Scanner(System.in);

    public static Personatge escollirOponent(Personatge atacant, ArrayList<Personatge> personatges) {
        System.out.println();
        System.out.println("És el torn de " + atacant.getNom());
        mostrarPersonatgesIVida(personatges);
        System.out.println(atacant.getNom() + ", escull a qui vols atacar:");
        int escollit = entrada.nextInt();
        return personatges.get(escollit-1);
    }

    public static void mostrarPersonatgesIVida(ArrayList<Personatge> personatges) {
        int i = 0;
        for (Personatge p : personatges) {
            System.out.println((i+1) + ". [" + p.getEquip().getNom() + "] " + p.getNom() + " ("+p.getVidaOMort()+")");
            i++;
        }
    }

    public static void mostrarFerAtac(Personatge atacant, Personatge atacat, int mal) {
        System.out.println(atacant.getNom() + " ataca a " + atacat.getNom() + " i li llança " + mal + " punts de mal");
    }

    public static void mostrarRebreAtac(Personatge p, int vidaActual, boolean viu) {
        System.out.println(p.getNom() + " ha estat atacat, ara té " + vidaActual + " de vida.");
        if (!viu) {
            System.out.println(p.getNom() + " ha mort.");
        }
    }

    public static String escollirAccio(Personatge personatge) {
        System.out.println();
        System.out.println("És el torn de " + personatge.getNom() + " (" + personatge.getVidaOMort() + ")");
        System.out.println("Què vol fer " + personatge.getNom() + "?");
        System.out.println("  1. Atacar");
        System.out.println("  2. Curar-se");
        int opcio = entrada.nextInt();
        return opcio == 2 ? "curar" : "atacar";
    }

    public static void mostrarCuracio(Personatge p, int vida, int vidaActual) {
        System.out.println(p.getNom() + " es cura " + vida + " punts de vida. Vida actual: " + vidaActual);
    }

    public static void mostrarFi(ArrayList<Personatge> personatges) {
        System.out.println();
        System.out.println("Estadístiques finals:");
        mostrarPersonatgesIVida(personatges);
        System.out.println("Gràcies per jugar.");
    }
}
