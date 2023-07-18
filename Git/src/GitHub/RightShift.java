package GitHub;

import java.util.Scanner;
public class RightShift {
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
	
		
		   int temp=ar[n-1];
		for(int j=n-2;j>=0;j--)
		{
			ar[j+1]=ar[j];
		}
		
		
			ar[0]=temp;
	

		System.out.println("The array after right shift: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
