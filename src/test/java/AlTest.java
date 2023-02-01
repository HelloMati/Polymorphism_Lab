import characters.Al;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

    public class AlTest {
        Al al;

        @BeforeEach
        void setUp(){
            al = new Al ("Sgt Al Powell", "Hero", true);
        }

        @Test
        void canMakeCatchphrase(){
            assertThat(al.makeCatchphrase()).isEqualTo("Aw, the hell with this");
        }

        @Test
        void canAskForHelp(){
            assertThat(al.askForHelp()).isEqualTo("I need backup assistance now! Now means now dammit!");
        }

        @Test
        void canEnemyKillCount(){
            assertThat(al.enemyKillCount()).isEqualTo(2);
        }

    }
