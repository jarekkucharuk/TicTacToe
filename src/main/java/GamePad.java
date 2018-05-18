
public class GamePad {

    private String selectedField;
    private String playerSign;
    private String[] gamePad = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public GamePad() {
    }

    public GamePad(String[] gamePad) {
        this.gamePad = gamePad;
    }

    public String[] getGamePad() {
        return gamePad;
    }

    public void printGamePad() {
        System.out.println();
        System.out.println("   " + 1 + "    " + 2 + "   " + 3);
        System.out.println("a  " + gamePad[0] + " |  " + gamePad[1] + " | " + gamePad[2]);
        System.out.println("  ------------");
        System.out.println("b  " + gamePad[3] + " |  " + gamePad[4] + " | " + gamePad[5]);
        System.out.println("  ------------");
        System.out.println("c  " + gamePad[6] + " |  " + gamePad[7] + " | " + gamePad[8]);
    }

    public int fieldNumber(String selectedField) {
        switch (selectedField) {
            case "a1":
                return 0;
            case "a2":
                return 1;
            case "a3":
                return 2;
            case "b1":
                return 3;
            case "b2":
                return 4;
            case "b3":
                return 5;
            case "c1":
                return 6;
            case "c2":
                return 7;
            case "c3":
                return 8;
        }
        return 10;
    }

    public void playerMove(String[] gamePad, String selectedField, String sign) {

        if (isFieldCorrect(gamePad, selectedField)) {
            gamePad[fieldNumber(selectedField)] = sign;
        }
    }

    public boolean isFieldCorrect(String[] gamePad, String selectedField) {

        if ((fieldNumber(selectedField) >= 0 && fieldNumber(selectedField) < 10) &&
                gamePad[fieldNumber(selectedField)].equals(" ")) {
            return true;
        } else
            return false;
    }
}

