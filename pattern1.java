class  pattern1
{

	public static void main(String[] args) 
	{
		int i,j=0,a=1,p;
		for(i=0;i<5;i=i+1){
			j=j+1;
			p=j;
			if(p%2==0){
			while(p!=0){
				System.out.print("*"+" ");
				a=a+1;
				p=p-1;
			}
			}
			else{
				while(p!=0){
				System.out.print(a+" ");
				a=a+1;
				p=p-1;
				}
			}
			System.out.println();
		}

				

	}
}
