package GitHub;

import java.util.Scanner;
public class LargestSmallest {
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
		int smallest,largest;
		largest=smallest=arr[0];
		for(int i=0;i<n;i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println("The largest element is: "+largest +"\nThe smallest element is: "+smallest);
	}

}
