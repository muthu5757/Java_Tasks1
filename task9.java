import java.util.Scanner;

public class task9 {
    public static void main(String[] args)
    {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        input = in.nextLine();
        if(input.contains("Java") || input.contains("java")) 
        System.out.println("The string contains Java");
        else 
        System.out.println("The String does not contains Java");
    }
}

