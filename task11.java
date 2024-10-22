import java.util.Random;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args)
    {
        int guess, attempts=0;
        System.out.println("!!... Guessing a Number Game ...!!");
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Enter the Number to Check : ");
            guess = in.nextInt();
            ++attempts;

            if(guess < numberToGuess) System.out.println("Wrong..!!Its too high. Try Once Again!!!");
            else if(guess > numberToGuess) System.out.println("Wrong..!!Its too Low. Try Once Again!!");
        }while(guess!=numberToGuess);

        System.out.println("Great!! Congrats!!..🤩️ You Correctly Guess the Number in "+attempts+" attempt !");

    }
}

