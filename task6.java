import java.util.Scanner;

public class task6 {
    public static void main(String[] args)
    {
        int temperature;
        System.out.println(" Celsius to Fahrenheit Conversion");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius :");
        temperature = in.nextInt();
        double Fahrenheit_value= (temperature * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is : "+Fahrenheit_value);
    }
}

