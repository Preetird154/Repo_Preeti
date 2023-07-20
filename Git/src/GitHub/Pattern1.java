package GitHub;

public class Pattern1 {
	public static void main(String[] args) {
		int n=5,res=0;
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<n-i;s++)
			{
				System.out.print(" ");
			}
			for(int c=0;c<=i;c++)
			{
				int ifact=1;
				for(int k=1;k<=i;k++)
				{
					ifact=ifact*k;
				}
			    int ijfact=1;
			    for(int ij=1;ij<=i-c;ij++)
			    {
			    	ijfact=ijfact*ij;
			    }
			    int jfact=1;
			    for(int m=1;m<=c;m++)
			    {
			    	jfact=jfact*m;
			    }
			    res=(ifact)/(ijfact*jfact);
			   System.out.print(res+" ");
			}
			System.out.println();
		}
	}


}
