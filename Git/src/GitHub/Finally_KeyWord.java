package GitHub;

import java.util.Scanner;
class ABC
{
	public void transaction()
	{
		System.out.println("connection established");
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter pin");
			int pin=sc.nextInt();
			System.out.println("Transaction successfull");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception was handled");
		}
		
		//System.out.println("connection terminated");
		
		finally
		{
			System.out.println("connection terminated");
		}
	}
}


public class Finally_KeyWord {
	public static void main(String[] args) {
		ABC d=new ABC();
		d.transaction();
	}

}
