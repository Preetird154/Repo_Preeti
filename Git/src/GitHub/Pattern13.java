package GitHub;

public class Pattern13 {
	public static void main(String[] args) {
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r==1||r==5||c==1||c==5||r==c||c==(n-r)+1 )
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}


}