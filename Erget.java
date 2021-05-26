interface A extends Object{
	default void m1(){
		System.out.println(1);
	}
}
interface B extends A{
	default void m1(){
		System.out.println(2);
}
class C implements A,B{
	public void m1(){
		System.out.println(3);
	}
}
class Test{
	public static void main(String[] args){
		A a=new C();
		a.m1();
	}
}
