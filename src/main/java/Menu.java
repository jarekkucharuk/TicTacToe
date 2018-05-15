import java.util.Scanner;

public class Menu {

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
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Podaj swój wybór: ");
        String choise = scanner.nextLine();
        switch (choise) {
            case "1":
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
                break;
        }
    }

}
