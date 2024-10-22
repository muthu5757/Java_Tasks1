import java.util.Arrays;
import java.util.Scanner;

public class task16 {
    public static void main(String[] args)
    {
        System.out.println("!!.... Sorting Strings on Arrays ....!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to enter : ");
        int n = in.nextInt();
        String[] string_array = new String[n];
        System.out.println("Enter Elements One by One : ");
        in.nextLine();
        for (int i=0;i<n;i++) {
            string_array[i] = in.nextLine();
        }

        Arrays.sort(string_array);
        System.out.println("The Sorted Array is : "+Arrays.toString(string_array));

    }
}

