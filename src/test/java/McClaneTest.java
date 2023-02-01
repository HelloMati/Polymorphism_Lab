import characters.McClane;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class McClaneTest {
    McClane mcclane;

    @BeforeEach
    void setUp(){
        mcclane = new McClane("McClane", "Hero", true);
    }

    @Test
    void canMakeCatchphrase__noArgument(){
        String expected = "Yippee-ki-yay, motherf****r!";
        assertThat(mcclane.makeCatchphrase()).isEqualTo(expected);
    }

    @Test
    void canMakeCatchphrase__withArgument(){
        String expected = "Come out to the coast! We'll get together, have a few laughs.";
        assertThat(mcclane.makeCatchphrase(" We'll get together, have a few laughs")).isEqualTo(expected);
    }

    @Test
    void canAskForHelp(){
        assertThat(mcclane.askForHelp()).isEqualTo("Mayday Mayday. [gets told urgent line only] No s**t lady! Does it sound like I'm ordering a pizza?");
    }

    @Test
    void canEnemyKillCount(){
        assertThat(mcclane.enemyKillCount()).isEqualTo(10);
    }

    @Test
    public void getHeroAchievements(){
        String result = mcclane.nakatomiplaza(8);
        assertThat(result).isEqualTo("McClane reached floor 8");
    }

}
