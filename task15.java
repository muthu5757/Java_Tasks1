import java.util.Scanner;

public class task15 {
    public static void main(String[] args)
    {
        System.out.println("!!.... Min & Max in array of Integers ....!!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to enter : ");
        int size = in.nextInt();
        int[] integer_array = new int[size];
        System.out.println("Enter Elements One by One : ");
        for (int i=0;i<size;i++) {
            integer_array[i] = in.nextInt();
        }
        int min = integer_array[0], max = integer_array[0];
        for (int value : integer_array){
            if(value > max) max = value;
            else if(value < min) min = value;
        }
        System.out.println("The largest value in array is : "+max);
        System.out.println("The Smallest value in array is : "+min);

    }
}

