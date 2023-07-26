package GitHub;

import java.util.Scanner;

public class Factor_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		int factor=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				factor++;
			}
		}
		System.out.println("The total factors for "+n+" is: "+factor);
	}

}
