class Happy 
{
	public static void main(String[] args) 
	{
		int n=97,sum=0,rem,pro=1;
		while(n>9)
		{
			sum=0;
			while(n>0)
			 {
				 rem=n%10;
			
				sum=sum+(rem*rem);
				n=n/10;
			 }
			 n=sum;
			
		}
		if(n==1)
		{
			System.out.println(n+" happy number");
		}
		else
		{
			System.out.println(n+" happy number");
		}

		
	}
}
