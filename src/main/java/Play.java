import java.util.Scanner;

public class Play {

    private int count;
    private String player1;
    private String player2;
    private String choise;
    GamePad gamePad;

    Scanner scanner = new Scanner(System.in);

    public void game() {
        count = 0;
        System.out.println();
        System.out.println("Podaj nick gracza nr 1: ");
        player1 = scanner.nextLine();
        System.out.println("Podaj nick gracza nr 2: ");
        player2 = scanner.nextLine();
        playerChoise();
        do {
            if (count % 2 == 0) {
                gamePad.playerMove(choise, "o");
            } else {
                gamePad.playerMove(choise, "x");
            }
            count++;
        }
        while (!isGameOver(gamePad.getGamePad()));
    }

    public void playerChoise() {

        while (true) {

            System.out.println();
            if ((double) (count / 2) == (double) count / 2) {
                System.out.println(player1 + " podaj pole: ");
                choise = scanner.nextLine();
                gamePad.playerMove(choise, "o");
            } else {
                System.out.println(player2 + " podaj pole: ");
                choise = scanner.nextLine();
                gamePad.playerMove(choise, "x");
            }
        }
    }

    public boolean isGameOver(String[] gamePad) {
        if (((gamePad[0].equals(gamePad[1])) && (gamePad[1].equals(gamePad[2]))) ||
                ((gamePad[3].equals(gamePad[4])) && (gamePad[4].equals(gamePad[5]))) ||
                ((gamePad[6].equals(gamePad[7])) && (gamePad[7].equals(gamePad[8]))) ||
                ((gamePad[0].equals(gamePad[3])) && (gamePad[3].equals(gamePad[6]))) ||
                ((gamePad[1].equals(gamePad[4])) && (gamePad[4].equals(gamePad[7]))) ||
                ((gamePad[2].equals(gamePad[5])) && (gamePad[5].equals(gamePad[8]))) ||
                ((gamePad[0].equals(gamePad[4])) && (gamePad[4].equals(gamePad[8]))) ||
                ((gamePad[2].equals(gamePad[4])) && (gamePad[4].equals(gamePad[6])))) {
            return true;
        } else
            for (int i = 0; i < 9; i++) {
                if (gamePad[i].equals(" ")) {
                    return false;
                }
            }
        return true;
    }
}
