package GitHub;

public class Pattern12 {
	public static void main(String[] args) {
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int s=r;s<n;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			for(int c=1;c<r;c++)
			{
				System.out.print(r);
			}
			System.out.println(" ");
		}
	}


}
