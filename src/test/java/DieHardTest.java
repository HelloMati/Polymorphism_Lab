import characters.Hans;
import characters.McClane;
import characters.Al;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import diehard.DieHard;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DieHardTest {
    DieHard diehard;

    @BeforeEach
    void setUp(){ diehard = new DieHard(); }

    @Test
    void canCountCharacters(){
        assertThat(diehard.countCharacters()).isEqualTo(0);
    }

    @Test
    void canAddCharacter(){
        Hans hans = new Hans("Hans Gruber", "Villain", 10);
        diehard.addCharacter(hans);
        assertThat(diehard.countCharacters()).isEqualTo(1);
    }

    @Test
    void canAddHeroAndVillain(){
        Hans hans = new Hans("Hans Gruber", "Villain", 10);
        McClane mcclane = new McClane("John McClane", "Hero", true);
        diehard.addCharacter(hans);
        diehard.addCharacter(mcclane);
        assertThat(diehard.countCharacters()).isEqualTo(2);
    }

    @Test
    void canGetHansCatchphrase(){
        Hans hans = new Hans("Hans Gruber", "Villain", 12);
        diehard.addCharacter(hans);
        assertThat(hans.makeCatchphrase()).isEqualTo("I have 12 henchmen. Give me my detonators. I am going to count to three. There will not be a four. 1, 2, 3. SHOOT THE GLASS!");
    }

    @Test
    void canGetMcClaneCatchphrase(){
        McClane mcclane = new McClane("John McClane", "Hero", true);
        diehard.addCharacter(mcclane);
        assertThat(mcclane.makeCatchphrase()).isEqualTo("Yippee-ki-yay, motherf****r!");
    }

    @Test
    void canGetAlCatchphrase(){
        Al al = new Al("Sgt Al Powell", "Hero", false);
        diehard.addCharacter(al);
        assertThat(al.makeCatchphrase()).isEqualTo("Aw, the hell with this");
    }

    @Test
    void canCountEnemiesKilled(){
        McClane mcclane = new McClane("John McClane", "Hero", true);
        Al al = new Al("Sgt Al Powell", "Hero", true);
        diehard.addCharacter(mcclane);
        diehard.addCharacter(al);
        assertThat(diehard.countEnemiesKilled()).isEqualTo(12);
    }

}
