interface  multiple{
		int operation(int a,int b);
	}
public class lambda{
	public static void main(String[] args){
		multiple add=(a,b)->a+b;
		System.out.println(add.operation(5,6));
	multiple su=new multiple(){
		public int operation(int a,int b){
			return a-b;
		}
	};
	System.out.println(su.operation(2,3));
}
}