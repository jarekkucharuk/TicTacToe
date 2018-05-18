import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayTest {

    Play play = new Play();

    @Test
    public void whoWon() throws Exception {

        String[] gamePad = {"x", "x", "x", "o", "x", "o", "x", "o", "x"};
        Assert.assertEquals("Tomek", play.whoWon(gamePad, "Ania", "Tomek"));
        String[] gamePad1 = {"o", "o", " ", " ", "x", "o", "o", " ", "x"};
        Assert.assertEquals(" ", play.whoWon(gamePad1, "Ania", "Tomek"));
        String[] gamePad2 = {"o", "x", "o", " ", "o", "x", "o", "o ", "x"};
        Assert.assertEquals("Ania", play.whoWon(gamePad2, "Ania", "Tomek"));

    }

    @Test
    public void isGameOver() throws Exception {

        String[] gamePad = {"o", "x", "x", "o", "x", "o", "x", "o", "x"};
        Assert.assertEquals(true, play.isGameOver(gamePad, "Ania", "Tomek"));
        String[] gamePad1 = {"o", "o", " ", " ", "x", "o", "o", " ", "x"};
        Assert.assertEquals(false, play.isGameOver(gamePad1, "Ania", "Tomek"));
        String[] gamePad2 = {"o", "o", "o", " ", "x", "x", "o", "x ", "x"};
        Assert.assertEquals(true, play.isGameOver(gamePad2, "Ania", "Tomek"));
    }

}