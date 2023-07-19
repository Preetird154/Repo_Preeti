package GitHub;

import java.util.Scanner;
public class Duplicate_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		System.out.println("Please enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("The duplicate number is :");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[i]==arr[k])
						{
							count--;
						}
					}
				}
				if(count>=1)
				{
					count=0;
					System.out.println(arr[i]);
				}
			}
			
		}
		
	}


}
