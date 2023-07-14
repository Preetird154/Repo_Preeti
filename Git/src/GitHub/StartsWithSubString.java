package GitHub;

import java.util.Scanner;

public class StartsWithSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first sentence");
		String str1=sc.nextLine();
		char[] arr1=str1.toCharArray();
		System.out.println("Please enter the second sentence");
		String str2=sc.nextLine();
		char[] arr2=str2.toCharArray();
		int count=0;
		
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[j]==arr2[j])
				{
					count++;
				}
			}
		
		if(count==arr2.length)
		{
			System.out.println("starts with substring");
		}
		else
		{
			System.out.println("not starts with substring");
		}
			
	}


}
