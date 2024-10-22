import java.util.Scanner;

public class task5 {
    public static void main(String[] args)
    {
        int age;
        String output;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Age :");
        age = in.nextInt();
        output= (age >= 18) ? "You are an adult" : "You are not yet an adult";
        System.out.println(output);
    }
}

