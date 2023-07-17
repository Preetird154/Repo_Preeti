package GitHub;

import java.util.Scanner;
public class every_Char_Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
 		{
			count=0;
			if(arr[i]!=' ')
			{
				for(int j=i;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						for(int k=i-1;k>=0;k--)
						{
							if(arr[i]==arr[k])
							{
								count--;
							}
						}
					}
				}
			}
			if(count>0)
			{
				System.out.println(arr[i]+" -> "+count);
			}
		}
	}


}
