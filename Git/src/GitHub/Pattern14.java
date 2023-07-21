package GitHub;

public class Pattern14 {
	public static void main(String[] args) {
		int n=5;
		for(int r=1;r<n;r++)
		{
			for(int s=r;s<n;s++)
			{
				System.out.print(" ");
			}
			
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			for(int c=1;c<r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for(int r=1;r<=n;r++)
			{
				for(int s=1;s<r;s++)
				{
					System.out.print(" ");
				}
				
				for(int c=r;c<=n;c++)
				{
					System.out.print("*");
				}
				for(int c=r;c<n;c++)
				{
					System.out.print("*");
				}
				
				System.out.println();
		}
	}


}
