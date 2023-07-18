package GitHub;

import java.util.Scanner;
public class LeftShift {
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
	
		
		   int temp=ar[0];
		for(int j=0;j<n-1;j++)
		{
			ar[j]=ar[j+1];
		}
		
		
			ar[n-1]=temp;
	

		System.out.println("The array after left shift: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
