interface I{
	int x=10;
}
class A implements I{
	int x=20;
}
public class B extends A{
	int x=30;
	public static void main(String[] args){
	   I obj=new B();
	   System.out.println(obj.x);
	}
}