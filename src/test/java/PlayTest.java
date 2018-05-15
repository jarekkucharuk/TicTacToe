import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayTest {
    @Test
    public void isGameOver() throws Exception {

        Play play = new Play();
        String[] gamePad = {"o", "x", "x", "o", "x", "o", "x", "o", "x"};
        Assert.assertEquals(true, play.isGameOver(gamePad));
        String[] gamePad1 = {"o", "o", " ", " ", "x", "o", "o", " ", "x"};
        Assert.assertEquals(false, play.isGameOver(gamePad1));
        String[] gamePad2 = {"o", "o", "o", " ", "x", "x", "o", "x ", "x"};
        Assert.assertEquals(true, play.isGameOver(gamePad2));
    }

}