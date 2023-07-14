package GitHub;

import java.util.Scanner;
public class Duplicate_Letter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=0;
		System.out.println("The duplicate letter is :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=i-1;k>=0;k--)
					{
						if(arr[k]==arr[i])
						{
							count--;
						}
					}
				}
			}
				if(count>=1)
				{
					//count=0;
					System.out.println(arr[i]);
				}
				count=0;
			}
			
		}
		


}
