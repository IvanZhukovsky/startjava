public class MyFirstGame {
    public static void main(String[] args) {
        int number = 75;
        int myNumber = 0;
        int count = 1;

        while (true) {
            if ((int) (Math.cos((count * 2) - count + 40)*110) <= 100) {
                myNumber = (int) (Math.cos((count * 2) - count + 40)*110);
                if (myNumber < 0) myNumber = myNumber*(-1);
                if (number < myNumber) {
                    System.out.printf("число %s больше того, что загадал компьютер%n", myNumber);
                }
                if (number > myNumber) {
                    System.out.printf("число %s меньше того, что загадал компьютер%n", myNumber);
                }
                if (number == myNumber) {
                    System.out.println("Вы победидли!");
                    break;
                }
            }
                count++;
        }
    }
}