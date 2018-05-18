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
        System.out.println("a   " + gamePad[0] + "|   " + gamePad[1] + "|   " + gamePad[2]);
        System.out.println("  ------------");
        System.out.println("b   " + gamePad[3] + "|   " + gamePad[4] + "|   " + gamePad[5]);
        System.out.println("  ------------");
        System.out.println("c   " + gamePad[6] + "|   " + gamePad[7] + "|   " + gamePad[8]);
    }

    public void playerMove(String [] gamePad, String selectedField, String sign) {

        switch (selectedField) {
            case "a1":
                gamePad[0] = sign;
                break;
            case "a2":
                gamePad[1] = sign;
                break;
            case "a3":
                gamePad[2] = sign;
                break;
            case "b1":
                gamePad[3] = sign;
                break;
            case "b2":
                gamePad[4] = sign;
                break;
            case "b3":
                gamePad[5] = sign;
                break;
            case "c1":
                gamePad[6] = sign;
                break;
            case "c2":
                gamePad[7] = sign;
                break;
            case "c3":
                gamePad[8] = sign;
                break;
            default:
                System.out.println("Nieznane pole");
        }
    }
}

