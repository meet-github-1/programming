class fibonacci 
{
	public static void main(String[] args) 
	{
		int n=10,i=0,a=1,b=0,c;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=0;i<n;i=i+1){
			System.out.print(a+" ");
			c=a+b;
			b=a;
			a=c;
		}



	}
}
