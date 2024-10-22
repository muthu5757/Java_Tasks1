import java.util.Scanner;

public class task10 {
    public static void main(String[] args)
    {
        int num1,num2,ans;
        System.out.println("!!...... Sum of Two Numbers .......!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");								
        num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        num2 = in.nextInt();
        ans = num1 + num2;
        System.out.println("The Sum of Two Numbers is : "+ans);
        
    }
}

