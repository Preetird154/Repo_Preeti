package GitHub;

import java.util.Scanner;
public class Trim_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		
		String s1="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				for(int j=i;j<arr.length;j++)
				{
				  s1=s1+arr[j];
				}
				break;
			}
		}
		char[] ar=s1.toCharArray();
		String s2="";
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]!=' ')
			{
				for(int j=i;j>=0;j--)
				{
				  s2=ar[j]+s2;
				}
				break;
			}
		}
		System.out.println("The output after trimming");
		  System.out.println(s2);
	}

}
