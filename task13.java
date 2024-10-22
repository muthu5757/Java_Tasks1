import java.util.Scanner;

public class task13 {
    public static void main(String[] args)
    {
        int size;
        float avg, sum=0 ;
        System.out.println("!!.... Average Finder ....!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to enter : ");
        size = in.nextInt();
        int[] input_array = new int[size];
        System.out.println("Enter Elements One by One : ");
        for (int i=0;i<size;i++)
        {
            input_array[i] = in.nextInt();
            sum+=input_array[i];
        }
        avg = sum / size ;
        System.out.println("The Average of "+size+" numbers is "+avg);

    }
}

