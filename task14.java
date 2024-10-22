import java.util.Scanner;

public class task14 {
    public static void main(String[] args)
    {
        String text;
        System.out.println("!!.... Palindrome Checking ....!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to Check : ");
        text = in.nextLine();
        String reversed_string = new StringBuilder(text).reverse().toString();
        if(reversed_string.equalsIgnoreCase(text))
            System.out.println(text+" is a Palindrome");
        else
            System.out.println(text+" is not a Palindrome");
    }
}

