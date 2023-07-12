package GitHub;

public class Throws_KeyWord {
	public void alpha() throws Exception
	{
		System.out.println("alpha is starting");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("alpha is ending");
	}
	
	public void beta() throws Exception
	{
		System.out.println("beta is starting");
		alpha();
		System.out.println("beta is ending");
	}
	
	public static void main(String[] args) {
		System.out.println("main is starting");
		try
		{
			new Throws_KeyWord().beta();
		}
		
		catch(Exception e)
		{
			System.out.println("Exception was handled by main()");
		}
		System.out.println("main is ending");
	}
}
