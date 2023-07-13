package GitHub;

class Laptop
{
	String brand;
	String color;
	int price;
	
	public Laptop()
	{
		this(10);
		System.out.println("control is inside 0-parameterized constuctor");
	}
	
	public Laptop(int price)
	{
		this("HP","BLACK",1000);
		System.out.println("control is inside 1-parameterized constuctor");
		System.out.println("Price: "+price);
	}
	
	public Laptop(String brand,String color,int price)
	{
		super();
		System.out.println("control is inside 3-parameterized constuctor");
		System.out.println("Brand: "+brand+" \nColor: "+color+" \nprice: "+price);
	}
}



public class this_Method {
	public static void main(String[] args) {
		Laptop l=new Laptop();
	}
}
