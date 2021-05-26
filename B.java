interface I{
	int x=10;
	public void m1();
}
class A implements I{
	int x=20;
	public  void m1(){
		System.out.println("A");
	}
	static void m2(){
        System.out.println("AM2");
	}
}
public class B extends A{
	int x=30;
	/*public  void m1(){
		System.out.println("B");
	}*/
	 static void m2(){
        System.out.println("BM2");
	}
	public static void main(String[] args){
	   A obj=new B();
	   //System.out.println(obj.x);
	   obj.m1();
	   //obj.m2();
	}
}