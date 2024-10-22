import java.util.*;
public class task12{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i, j;
		System.out.println("Enter the String : ");
		String text = in.nextLine();
		int length = text.length();
		char inputArray[] = text.toCharArray();
		String result = "";
		for(i=length-1;i>=0;i--)
		{
			result+=inputArray[i];
		}
		System.out.println("The reversed String is : "+ result);
}
}
