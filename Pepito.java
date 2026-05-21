public class Pepito extends Personatge {

    private static final int MAL = 25;
    private static final int CURACIO = 30;

    public Pepito(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void torn(Combatents combatents) {
        if (!esViu()) return;

        String accio = UI.escollirAccio(this);

        if (accio.equals("curar")) {
            curar(CURACIO);
        } else {
            // atacar: seguim el flux normal (escollir oponent i ferAccio)
            super.torn(combatents);
        }
    }

    @Override
    public void ferAccio(Personatge oponent) {
        atacarAmbMal(oponent, MAL);
    }
}
