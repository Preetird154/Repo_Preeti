package GitHub;

import java.util.Scanner;
public class Middle_SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first sentence");
		String str1=sc.nextLine();
		char[] arr1=str1.toCharArray();
		System.out.println("Please enter the second sentence");
		String str2=sc.nextLine();
		char[] arr2=str2.toCharArray();
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
             count=0;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i+j]==arr2[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count==arr2.length)
			{
				System.out.println("middle substring");
				break;
			}
		}
		if(count!=arr2.length)
		{
			System.out.println("not middle substring");
		}
	}


}
