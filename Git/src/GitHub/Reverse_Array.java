package GitHub;

import java.util.Scanner;
public class Reverse_Array {
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
		for(int i=0;i<n/2;i++)
		{
			int temp=ar[n-1-i];
			ar[n-1-i]=ar[i];
			ar[i]=temp;
		}
		System.out.println("The reverse of elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}


}
