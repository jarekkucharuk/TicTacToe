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

        gamePad.playerMove("a2", "o");
        Assert.assertEquals("o", gamePad.getGamePad()[1]);
        gamePad.playerMove("c2", "x");
        Assert.assertEquals("x", gamePad.getGamePad()[7]);
    }
}