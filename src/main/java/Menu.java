import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Play play = new Play();

    public void menuDisplay() {
        System.out.println("     MENU");
        System.out.println("1 : nowa gra");
        System.out.println("2 : przegląd wyników");
        System.out.println("3 : przegląd nicków");
        System.out.println("4 : utworzenie nicka");
        System.out.println("5 : wyjście");
    }

    public void menuChoise() {
        System.out.println();
        System.out.println("Podaj swój wybór: ");
        String choise = scanner.nextLine();
        switch (choise) {
            case "1":
                play.readPlayers();
                play.game();
                break;
            /*case "2": showResults();
            break;
            case "3": showNicks();
            break;
            case "4": newNick();
            break;*/
            case "5":
                break;
            default:
                System.out.println("Nierozpoznany wybór");
        }
    }

}
