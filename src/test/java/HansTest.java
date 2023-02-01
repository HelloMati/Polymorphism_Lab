import characters.Hans;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HansTest {
    Hans hans;

    @BeforeEach
    void setUp(){
        hans = new Hans("Hans", "Villain", 12);
    }

    @Test
    void canMakeCatchphrase(){
        assertThat(hans.makeCatchphrase()).isEqualTo("I have 12 henchmen. Give me my detonators. I am going to count to three. There will not be a four. 1, 2, 3. SHOOT THE GLASS!");
    }

}
