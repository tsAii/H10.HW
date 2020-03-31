package H10.HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AndroidTest {
    @Test
    void testGreet() {
        Android android = new Android("Android 18");
        int powerlevel = android.charge(9000);
        String greetings = android.greet();

        assertEquals(9000, powerlevel);
        assertEquals("I'm only half human, but human still...My powerlevel is over 2000.", greetings);
    }
}
