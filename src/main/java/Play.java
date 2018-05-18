import java.util.Scanner;

public class Play {

    private int count;
    private String player1;
    private String player2;
    private String choise;
    GamePad gamePad = new GamePad();

    Scanner scanner = new Scanner(System.in);

    public GamePad getGamePad() {
        return gamePad;
    }

    public void readPlayers() {
        System.out.println();
        System.out.println("Podaj nick gracza nr 1: ");
        player1 = scanner.nextLine();
        System.out.println("Podaj nick gracza nr 2: ");
        player2 = scanner.nextLine();
    }

    public void game() {
        count = 0;
        do {
            gamePad.printGamePad();
            playerChoise(player1, player2);
            gamePad.playerMove(gamePad.getGamePad(), player1, player2);

            if (count % 2 == 0) {
                gamePad.playerMove(gamePad.getGamePad(), choise, "o");
            } else {
                gamePad.playerMove(gamePad.getGamePad(), choise, "x");
            }
            count++;
        }
        while (!isGameOver(gamePad.getGamePad(), player1, player2));
        if (whoWon(gamePad.getGamePad(), player1, player2).equals(player1) ||
                whoWon(gamePad.getGamePad(), player1, player2).equals(player1)) {
            gamePad.printGamePad();
            System.out.println();
            System.out.println("Koniec gry. Wygrywa: " +
                    whoWon(gamePad.getGamePad(), player1, player2) + ". Gratulacje !");
        } else {
            System.out.println();
            System.out.println("Koniec gry. Nie ma zwycięzcy.");
        }
    }

    public void playerChoise(String player1, String player2) {

        System.out.println();
        if ((double) (count / 2) == (double) count / 2) {
            System.out.println(player1 + " podaj pole: ");
            choise = scanner.nextLine();
        } else {
            System.out.println(player2 + " podaj pole: ");
            choise = scanner.nextLine();
        }
    }

    public boolean isGameOver(String[] gamePad, String player1, String player2) {

        if (whoWon(gamePad, player1, player2).equals(player1) ||
                whoWon(gamePad, player1, player2).equals(player2)) {
            return true;
        } else
            for (int i = 0; i < 9; i++) {
                if (gamePad[i].equals(" ")) {
                    return false;
                }
            }
        return true;
    }

    public String whoWon(String[] gamePad, String player1, String player2) {

        if (((gamePad[0].equals(gamePad[1])) && (gamePad[1].equals(gamePad[2]))) && (gamePad[1].equals("o"))) {
            return player1;
        } else if (((gamePad[0].equals(gamePad[1])) && (gamePad[1].equals(gamePad[2]))) && (gamePad[1].equals("x"))) {
            return player2;
        } else if (((gamePad[3].equals(gamePad[4])) && (gamePad[4].equals(gamePad[5]))) && (gamePad[4].equals("o"))) {
            return player1;
        } else if (((gamePad[3].equals(gamePad[4])) && (gamePad[4].equals(gamePad[5]))) && (gamePad[4].equals("x"))) {
            return player2;
        } else if (((gamePad[6].equals(gamePad[7])) && (gamePad[7].equals(gamePad[8]))) && (gamePad[7].equals("o"))) {
            return player1;
        } else if (((gamePad[6].equals(gamePad[7])) && (gamePad[7].equals(gamePad[8]))) && (gamePad[7].equals("x"))) {
            return player2;
        } else if (((gamePad[0].equals(gamePad[3])) && (gamePad[3].equals(gamePad[6]))) && (gamePad[3].equals("o"))) {
            return player1;
        } else if (((gamePad[0].equals(gamePad[3])) && (gamePad[3].equals(gamePad[6]))) && (gamePad[3].equals("x"))) {
            return player2;
        } else if (((gamePad[1].equals(gamePad[4])) && (gamePad[4].equals(gamePad[7]))) && (gamePad[4].equals("o"))) {
            return player1;
        } else if (((gamePad[1].equals(gamePad[4])) && (gamePad[4].equals(gamePad[7]))) && (gamePad[4].equals("x"))) {
            return player2;
        } else if (((gamePad[2].equals(gamePad[5])) && (gamePad[5].equals(gamePad[8]))) && (gamePad[5].equals("o"))) {
            return player1;
        } else if (((gamePad[2].equals(gamePad[5])) && (gamePad[5].equals(gamePad[8]))) && (gamePad[5].equals("x"))) {
            return player2;
        } else if (((gamePad[0].equals(gamePad[4])) && (gamePad[4].equals(gamePad[8]))) && (gamePad[4].equals("o"))) {
            return player1;
        } else if (((gamePad[0].equals(gamePad[4])) && (gamePad[4].equals(gamePad[8]))) && (gamePad[4].equals("x"))) {
            return player2;
        } else if (((gamePad[2].equals(gamePad[4])) && (gamePad[4].equals(gamePad[6]))) && (gamePad[4].equals("o"))) {
            return player1;
        } else if (((gamePad[2].equals(gamePad[4])) && (gamePad[4].equals(gamePad[6]))) && (gamePad[4].equals("x"))) {
            return player2;
        } else return " ";
    }
}
