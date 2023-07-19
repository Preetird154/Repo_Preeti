package GitHub;

import java.util.Scanner;
public class Remove_Middle_Index {
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
		System.out.println("Enter the element you want to remove");
	    int remove=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	if(ar[i]==remove)
	    	{
	    		for(int j=i;j<n-1;j++)
	    		{
	    			ar[j]=ar[j+1];
	    			
	    		}
	    		break;
	    	}
	    }
	    System.out.println("Final output is: ");
	    for(int i=0;i<n-1;i++)
	    {
	    	System.out.println(ar[i]);
	    }
	}

}
