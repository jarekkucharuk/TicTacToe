import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GamePadTest {

    String[] pad = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    GamePad gamePad = new GamePad(pad);

    @Test
    public void printGamePad() throws Exception {
    }

    @Test
    public void playerMove() throws Exception {

        gamePad.playerMove(pad, "b2", "o");
        Assert.assertEquals("o", pad[4]);
        gamePad.playerMove(pad, "c3", "x");
        Assert.assertEquals("x", pad[8]);
    }
}