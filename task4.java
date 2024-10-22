import java.util.Scanner;

public class task4 {
    public static void main(String[] args)
    {
        int number;
        System.out.println("Positive or Negative Number Checking");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to Find :");
        number = in.nextInt();
        if(number > 0) System.out.println("This is a Positive Number");
        else if(number < 0) System.out.println("This is a Negative Number");
        else System.out.println("The number is Zero. Its neither Positive nor Negative Number");
    }
}

