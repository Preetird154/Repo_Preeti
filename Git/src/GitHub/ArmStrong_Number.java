package GitHub;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		int temp = n, sum = 0, rem;
		while (temp > 0) {
			temp = temp / 10;
			sum++;
		}
		int temp1 = n, res = 0;
		while (temp1 > 0) {
			rem = temp1 % 10;
			int sum1 = 1;
			for (int i = 1; i <= sum; i++) {
				sum1 = sum1 * rem;
			}
			res = res + sum1;
			temp1 = temp1 / 10;
		}
		if (res == n) {
			System.out.println("It is a ArmStrong number");
		} else {
			System.out.println("It is not a ArmStrong number");
		}
	}

}
