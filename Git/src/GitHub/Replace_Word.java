package GitHub;

import java.util.Scanner;
public class Replace_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String str = sc.nextLine();
		char[] arr1 = str.toCharArray();

		System.out.println("enter the word you want to replace");
		String str1 = sc.nextLine();
		char[] arr2 = str1.toCharArray();

		System.out.println("enter the new word");
		String str2 = sc.nextLine();
		char[] arr3 = str2.toCharArray();

		int count = 0;
		int index = 0;
		for (int i = 0; i < arr1.length; i++) 
		{
			index = 0;
			count = 0;
			for (int j = 0; j < arr2.length; j++) 
			{
				if (arr1[i + j] == arr2[j]) 
				{
					index = i;
					count++;
				} else {
					break;
				}
			}

			if (count == arr2.length) 
			{
				for (int k = 0; k < arr3.length; k++) 
				{
					arr1[index] = arr3[k];
					index++;
				}
				for (int k = 0; k < arr1.length; k++) 
				{
					System.out.print(arr1[k]);
				}
			}
		}

	}

}
