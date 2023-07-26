package GitHub;

import java.util.Scanner;

public class Largest_Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value for large and small");
		int large,small;
		large=small=sc.nextInt();
		
		int opt=1;
		while(opt==1)
		{
			System.out.println("Please enter the number");
			int n=sc.nextInt();
			if(n>large)
			{
				large=n;
			}
			else if(n<small)
			{
				small=n;
			}
			System.out.println("please enter 1 to continue and 0 to exit");
			opt=sc.nextInt();
		}
		System.out.println("The largest number among the entered numbers is: "+large);
		System.out.println("The smallest number among the entered numbers is: "+small);
	}


}
