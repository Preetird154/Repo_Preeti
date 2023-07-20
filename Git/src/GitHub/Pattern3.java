package GitHub;

public class Pattern3 {
	public static void main(String[] args) {

		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {
				if (r == 1 || r == 4 || c == 1 || c == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");

		}
	}

}
