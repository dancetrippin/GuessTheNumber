import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        /*
        cere de la user un numar de la 1 la 100
        daca numarul introdus  este mai mic de 100 sa se afiseze: more
        daca numarul introdus  este mai mare de 100 sa se afiseze: less
        daca numarul introdus  este egal cu nr introdus,sa se afiseze: egal
         */

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int hiddenNumber = random.nextInt(100);
        int attempts = 0;

        while (true) {
            System.out.print("Guess a number (1-100): ");
            int guessedNumber = sc.nextInt();
            attempts++;

            if (guessedNumber < hiddenNumber) {
                System.out.println("More!");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less!");
            } else {
                System.out.println("You guessed the number!");
                System.out.println("You used " + attempts + " attempts!");
                break;
            }
        }
    }
}
        //attempts++, attempts+=1, attempts=attempts + 1     -> sunt identice

        //// TODO: 17/06/2024 Implementeza un sistem de vieti (8 vieti, la a 9-a Game Over + break)
