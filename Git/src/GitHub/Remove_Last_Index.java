package GitHub;

import java.util.Scanner;
public class Remove_Last_Index {
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
			ar[n-1-i]=ar[n-2-i];
		}
		System.out.println("The array after removing last inndex");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}


}
