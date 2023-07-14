package GitHub;

import java.util.Scanner;
public class EndsWithSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first sentence");
		String str1=sc.nextLine();
		char[] arr1=str1.toCharArray();
		System.out.println("Please enter the second sentence");
		String str2=sc.nextLine();
		char[] arr2=str2.toCharArray();
		int count=0;
		
        	for(int i=0;i<=arr2.length-1;i++)
			{
				  if(arr2[(arr2.length-1)-i]==arr1[(arr1.length-1)-i])
				 {
					count++;
				 }
			}
		
		if(count==arr2.length)
		{
			System.out.println("ends with substring");
		}
		else
		{
			System.out.println(" not ends with substring");
		}
			
	}


}
