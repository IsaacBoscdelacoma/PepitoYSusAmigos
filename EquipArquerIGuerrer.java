public class EquipArquerIGuerrer extends Equip {
    public EquipArquerIGuerrer(String nom) {
        super(nom);
        personatges.add(new Arquer("Alys"));
        personatges.add(new Guerrer("Borguin"));
    }
}
