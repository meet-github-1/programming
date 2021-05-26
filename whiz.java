import  static java.lang.System.*;
public class whiz{
	public static void main(String[] args){
		Base bs=new Subclass();
		bs.display();



	}
}
	class Base{
		public static void display(){
			System.out.println("Base");
		}
	}
	class Subclass extends Base{
		public static void display(){
			System.out.println("Subclass");
		}
	}