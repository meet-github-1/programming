class  prime
{
	public static void main(String[] args) 
	{
		int n=100,i,j,flag=0;
		for(i=2;i<n;i=i+1){
			flag=0;
			for(j=2;j<i;j=j+1){
				if(i%j==0){
					flag=1;
				}
			}
			if(flag==0){
				System.out.println("prime number are="+i);
			}
			else{
				continue;
			}
		}

				
	}
}
