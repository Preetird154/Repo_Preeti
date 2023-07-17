package GitHub;

import java.util.Scanner;
public class Occurence_of_Char {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=0;
		System.out.println("enter one character");
		char c=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==c)
			{
				count++;
			}
		}
		System.out.println("The total count is:"+count);
		
	}

}
