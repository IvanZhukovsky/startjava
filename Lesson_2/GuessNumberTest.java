import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока:");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока:");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.startGame();
    }
}