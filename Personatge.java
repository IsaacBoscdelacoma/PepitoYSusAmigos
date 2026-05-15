import java.util.ArrayList;

public abstract class Personatge {
    private String nom;
    private final int VIDA_INICIAL = 100;
    private boolean estaViu;
    private int vidaActual;
    private int malFet;

    public Personatge(String nom) {
        this.nom = nom;
        estaViu = true;
        vidaActual = VIDA_INICIAL;
        malFet = 0;
    }

    public void torn(Combatents combatents) {
        ArrayList<Personatge> oponents = combatents.obtenirPersonatgesVius();
        Personatge oponent = UI.escollirOponent(this, oponents);
        atacar(oponent);
    }

    abstract public void atacar(Personatge oponent);

    protected void atacarAmbMal(Personatge oponent, int mal) {
        System.out.println(this + " ataca a " + oponent + " i li llança " + mal + " punts de mal");
        if (estaViu) {
            oponent.rebreMal(mal);
        }
    }

    public void rebreMal(int mal) {
        vidaActual = vidaActual - mal;
        System.out.println(this + " ha estat atacat, ara té " + vidaActual + " de vida.");
        System.out.println();
        if (vidaActual <=0) {
            estaViu = false;
            System.out.println(this + " ha mort.");
        }
    }

    public boolean esViu() {
        return estaViu;
    }

    protected void augmentarMalFet(int malFet) {
        this.malFet = this.malFet + malFet;
    }

    public int getMalFet() {
        return malFet;
    }

    public String getVidaOMort() {
        if (estaViu) {
            return Integer.toString(vidaActual);
        }
        else {
            return("mort");
        }
    }

    public String getNom() {
        return nom;
    }
}
