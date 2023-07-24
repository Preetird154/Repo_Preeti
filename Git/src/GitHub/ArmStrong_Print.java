package GitHub;

public class ArmStrong_Print {
	public static void main(String[] args) {
		int n=1000,count=0;
		for(int i=1;i<=n;i++)
		{
			int temp=i, sum=0,rem;
		    while(temp>0)
		    {
		    	temp=temp/10;
		    	sum++;
		    }
		    int temp1=i, res=0;
		    while(temp1>0)
		    {
		    	rem=temp1%10;
		    	int sum1=1;
		    	for(int k=1;k<=sum;k++)
		    	{
		    		sum1=sum1*rem;
		    	}
		    	res=res+sum1;
		    	temp1=temp1/10;
		    }
		    if(res==i)
		    {
		    	System.out.println(i);
		    	count++;
		    }
		    
		}
		System.out.println("The total count is:"+count);
	}


}
