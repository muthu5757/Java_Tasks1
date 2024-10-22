import java.util.Scanner;

public class task3 {
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");								
        number1 = in.nextInt();
        System.out.println("Enter the number 2:");
        number2 = in.nextInt();
        if (number1 > number2)
            System.out.println(number1+" is greater than "+number2);
        else if (number1 < number2)
            System.out.println(number1+" is less than "+number2);
        else
            System.out.println(number1+" is equals to "+number2);
    }
}

