public class Morthex extends Personatge {

    public Morthex(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        int malTotal = 0;

        for (int i = 0; i < 5; i++) {
            malTotal += Dau.tirar(6);
        }

        augmentarMalFet(malTotal);
        super.atacarAmbMal(oponent, malTotal);
    }
}
