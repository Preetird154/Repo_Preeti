package GitHub;

public class Pattern11 {
	public static void main(String[] args) {
		int n=3;
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
