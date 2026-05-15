import java.util.ArrayList;

public class Combatents {
    ArrayList<Equip> equips;

    public Combatents() {
        equips = new ArrayList<>();
    }

    public void afegir(Equip e) {
        equips.add(e);
    }

    public void torn() {
        for (Equip e : equips) {
            e.torn(this);
        }
    }

    public ArrayList<Personatge> obtenirPersonatges() {
        ArrayList<Personatge> personatgesVius = new ArrayList<>();
        for (Equip e : equips) {
            personatgesVius.addAll(e.obtenirPersonatges());
        }
        return personatgesVius;
    }
}
