import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter Rock(0), Paper(1), Scissor(2): ");
            int user = input.nextByte();
            int comp = random.nextInt(3);
            System.out.println("User: " + user);
            System.out.println("Comp: " + comp);
            if (user == comp) {
                System.out.println("Draw!");
            } else if (user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                System.out.println("Lose!");
            } else if (comp == 0 && user == 1 || comp == 1 && user == 2 || comp == 2 && user == 0){
                System.out.println("Win!");
            } else {
                System.out.println("plz try again!");
            }
        }
    }
}
