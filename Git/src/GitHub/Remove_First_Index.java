package GitHub;

import java.util.Scanner;
public class Remove_First_Index {
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
		for(int i=0;i<n-1;i++)
		{
			ar[i]=ar[i+1];
		}
		System.out.println("The array after removing first index");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
