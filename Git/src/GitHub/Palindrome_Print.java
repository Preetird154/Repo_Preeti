package GitHub;

public class Palindrome_Print {
	public static void main(String[] args) {
		int n = 1000, count = 0;
		for (int i = 1; i <= n; i++) {

			int temp = i, digit, mov, rev = 0;
			while (temp > 0) {
				digit = temp % 10;
				mov = rev * 10;
				rev = mov + digit;
				temp = temp / 10;
			}
			if (rev == i) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("The total count is: " + count);
	}

}
