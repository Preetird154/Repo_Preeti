package GitHub;

import java.util.Scanner;
public class Average_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Please enter the elements of array");
		int sum=0;
		double avg=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			avg=sum/n;
		}
	    System.out.println("The average of array is: "+avg);
	}

}
