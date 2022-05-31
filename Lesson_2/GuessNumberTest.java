import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String option;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока:");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока:");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.next();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
    }
}