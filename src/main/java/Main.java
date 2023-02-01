import characters.Al;
import characters.Hans;
import characters.McClane;
import diehard.DieHard;

public class Main {
    public static void main(String[] args) {
        Hans hans = new Hans("Hans", "Villain", 12);
        McClane mcclane = new McClane("McClane", "Hero", true);
        Al al = new Al("Sgt Al Powell", "Hero", true);
        DieHard diehard = new DieHard();
        diehard.addCharacter(hans);
        diehard.addCharacter(mcclane);
        diehard.addCharacter(al);
        diehard.getCatchphraseCharacters();
    }
}
