interface I{
	void m1();
}
interface J extends I{
	void m2();
	
}
class C implements J{
	public void m2() {
		System.out.println("m2 called");
	}
}
public class interface1 {
	public static void main(string[] args) {
		J j1=new J(){
			public void m1(){
				System.out.println("m1 called");}
			public void m2(){
				System.out.println("m2 called");
			}

			}
		
	}

}
