import java.util.Scanner;

public class task8 {
    public static void main(String[] args)
    {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        number = in.nextInt();
        if(number >= 1 && number <= 50) System.out.println("The number is in the lower half");
        else if(number > 50 && number <= 100) System.out.println("The number is in the upper half");
        else System.out.println("Invalid Number");
    }
}

