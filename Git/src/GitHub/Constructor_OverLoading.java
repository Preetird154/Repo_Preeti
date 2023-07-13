package GitHub;

class pm
{
	int a=20;
	int b=10;
	public pm(int a,int b)
	{
		int res=a+b;
		System.out.println("Add: "+res);
	}
	
	public pm(int a)
	{
		System.out.println("The value of a is: "+a);
	}
	
	public pm()
	{
		System.out.println("Hello Welcome");
	}
	
	public pm(String name)
	{
		System.out.println("Name: "+name);
	}
}


public class Constructor_OverLoading {
	public static void main(String[] args) {
		pm m=new pm();
	}

}
