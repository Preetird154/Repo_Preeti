package GitHub;

import java.util.Scanner;
public class Add_Middle_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n=sc.nextInt();
		int [] ar=new int[n];
		System.out.println("Please enter the array elements");
		int []b=new int[n+1];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("After which value you want to enter");
		int enter=sc.nextInt();
		System.out.println("Enter the element");
		int ele=sc.nextInt();
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(ar[i]==enter)
			{
				index=i;
				break;
			}
		}
		for(int i=n-1;i>index;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[index+1]=ele;
		System.out.println("final output is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
	}


}
