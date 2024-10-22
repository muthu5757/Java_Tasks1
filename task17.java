import java.util.Arrays;
import java.util.Scanner;

public class task17 {
    public static void main(String[] args)
    {
        System.out.println("!!.... Multiplication Table ....!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Table Number : ");
        int number = in.nextInt();
        System.out.println("From 1 to which range you need : ");
        int range = in.nextInt();
        for (int i=1; i<=range; i++)
        {
            System.out.println(i+" * "+number+" = "+i*number);
        }
    }
}

