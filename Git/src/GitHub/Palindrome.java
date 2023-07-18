package GitHub;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the length of array");
			int n=sc.nextInt();
			int [] ar=new int[n];
			System.out.println("Please enter the array elements");
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			boolean val=true;
			for(int i=0;i<n/2;i++)
			{
				if(ar[i]!=ar[n-i-1])
				{
					val=false;
					break;
				}
				
			}
			if(val==true)
			{
				System.out.println("The given array is palindrome");
			}
			else
			{
				System.out.println("The given array is not palindrome");
			}


	}

}
