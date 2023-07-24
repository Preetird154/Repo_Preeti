package GitHub;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		int temp=n, sum=0;
		while(temp>0)
		{
			temp=temp/10;
			sum++;
		}
		System.out.println("The number of digits present in "+n+" is: "+sum);
		
	}

}
