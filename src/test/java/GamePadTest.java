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

    @Test
    public void fieldNumber() throws Exception {

        Assert.assertEquals(2,gamePad.fieldNumber("a3"));
        Assert.assertEquals(10, gamePad.fieldNumber("r3"));
    }

    @Test
    public void isFieldCorrect () throws Exception {
        String[] pad = {"x", "o", "x", "o", " ", "o", "x", "x", "o"};
        Assert.assertEquals(false,gamePad.isFieldCorrect(pad,"c2"));
        Assert.assertEquals(true,gamePad.isFieldCorrect(pad,"b2"));
        Assert.assertEquals(false,gamePad.isFieldCorrect(pad,"w2"));

    }
}