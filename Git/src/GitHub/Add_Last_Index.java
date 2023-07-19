package GitHub;

import java.util.Scanner;
public class Add_Last_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Please enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter the new element you want to add");
		int new_ele=sc.nextInt();
		
		for(int i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=new_ele;
		
		System.out.println("The element is inserted  at the last index");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
