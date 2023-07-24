package GitHub;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the set of numbers");
		int n=sc.nextInt();
		int temp=n,rem,even_sum=0, odd_sum=0;
		while(temp>0)
		{
			rem=temp%10;
			if(rem%2==0)
			{
				even_sum=even_sum+rem;
			}
			else if(rem!=0)
			{
				odd_sum=odd_sum+rem;
			}
			temp=temp/10;
		}
		System.out.println("The sum of even numbers is: "+even_sum+ " . The sum of odd numbers is: "+odd_sum);
	}


}
