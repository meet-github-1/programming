class value{
	static void fun(Integer i,String j){
	    i=i+1;
	    j=j+"kmit";
	}
	public static void main(String[] args){
           Integer i=10;
           String j="100";
           fun(i,j);
           //j=j+"kmit";
           System.out.println(i+" "+j);



	} 
}