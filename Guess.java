import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random newNo = new Random();

        int random = newNo.nextInt(101);

        int i = 1;
        while (i<=100) {
            System.out.print("Enter Guess: ");
            int user = sc.nextByte();

            if (user == random) {
                System.out.println("you win in: " + i + " steps!");
                break;
            }

            if (user<random) {
                System.out.println("Enter a bigger number");
            }
            if (user>random) {
                System.out.println("Enter a smaller number");
            }
            i++;
        }
    }
}
