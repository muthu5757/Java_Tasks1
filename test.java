import java.util.*;
public class test {
public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number as multiple of 5 : ");
			int num = in.nextInt();
			int n = num/5;
			int i,j=0;
			for(i=1;i<=9;i++)
			{
				switch(i)
				{
								case 1 :
										for(j=1;j<=n;j++){
													System.out.print(" > ");
												}
												System.out.println();
										break;
								case 2:
										for(int k=1;k<=n-1;k++)
											{
												for(j=1;j<=n;j++){
													if(j==n)
														System.out.print(" ! ");
													else if(j==1)
													 	System.out.print(" | ");
													 else if(k==1) 
													 	System.out.print(" > ");
													 else
													 	System.out.print("   ");
												}
												System.out.println();
											}
											break;
								case 3: 
										for(j=1;j<=n;j++){
													System.out.print(" < ");
												}
												System.out.println();
										break;	
				}
			}
				
	}
}
				
				
