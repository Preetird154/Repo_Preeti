package GitHub;

import java.util.Scanner;
public class Word_Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=1;
		System.out.println("The total word count is:");
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==' ')

			 {
				 if(!(i==0||i==arr.length-1))
				 {
					 count++;
				 }
				 if(i!=(arr.length-1))
				 {
					 if(arr[i+1]==' ')
					 {
						 count--;
					 }
				 }
			 }
		}
		System.out.println(count);
	}

}
