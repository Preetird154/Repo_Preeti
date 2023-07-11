package GitHub;

import java.util.Scanner;

public class Exception_Handling {
	public static void main(String[] args) {

		System.out.println("program is starting");
		try {
			// DIVISION

			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation");
			System.out.println("enter numerator");
			int a = sc.nextInt();
			System.out.println("enter denominator");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result: " + c);

			// ARRAYS

			System.out.println("Array related operation");
			System.out.println("enter the size of array");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("enter array elements");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
		}

		catch (ArithmeticException Exception) {
			System.out.println("Division by zero is not allowed");
		}

		catch (NegativeArraySizeException Exception) {
			System.out.println("Please enter a positive array size");
		}

		catch (ArrayIndexOutOfBoundsException Exception) {
			System.out.println("some problem with the code");
		}
		

		catch (Exception e) {
			System.out.println("Some exception has occured");
			// e.printStackTrace();
		} finally {
			System.out.println("program ended");
		}
	}
}
