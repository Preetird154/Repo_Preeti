package GitHub;

public class Static_Program {

	int a, b;
	static int x, y;

	public void fun1() 
	{
		System.out.println("non-static method");
	}

	{
		System.out.println("non-static block");
	}

	public static void fun2() 
	{
		System.out.println("static method");
	}

	public Static_Program() 
	{
		System.out.println("constructor");
	}

	static 
	{
		x = 20;
		y = 40;
		System.out.println("static block");
		System.out.println("X= " + Static_Program.x + " Y= " + Static_Program.y);
	}

	public static void main(String[] args) {
		System.out.println("main()");
		Static_Program s = new Static_Program();
		s.fun1();
		s.fun2();

	}

}
