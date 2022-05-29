import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    private int player1Number;
    private int player2Number;
    private String option;

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        do {
            targetNumber = ((int) (Math.random() * 100)) + 1;
            while (true) {
                System.out.print(player1.getName() + " назовите число:");
                player1Number = scanner.nextInt();
                if (targetNumber < player1Number) {
                    System.out.printf("число %s больше того, что загадал компьютер%n", player1Number);
                } else if (targetNumber > player1Number) {
                    System.out.printf("число %s меньше того, что загадал компьютер%n", player1Number);
                } else {
                    System.out.println(player1.getName() + " вы победили!");
                    break;
                }
                System.out.print(player2.getName() + " назовите число:");
                player2Number = scanner.nextInt();
                if (targetNumber < player2Number) {
                    System.out.printf("число %s больше того, что загадал компьютер%n", player2Number);
                } else if (targetNumber > player2Number) {
                    System.out.printf("число %s меньше того, что загадал компьютер%n", player2Number);
                } else {
                    System.out.println(player2.getName() + " вы победили!");
                    break;
                }
            }
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.next();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
    }
}