package GitHub;

import java.util.Scanner;
public class Split_Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				count++;
			}
		}
		String[] arr1=new String[count];
		int index=0;
		String temp="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				index++;
				temp="";
			}
			else
			{
				temp=temp+arr[i];
				arr1[index]=temp;
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}


}
