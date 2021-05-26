import java.io.Serializable;
import java.io.*;
class Employee implements Serializable{//marker interface class
    int empid;
    String ename;
    Employee(int id,String ename){
		System.out.println("constructor called");
      empid=id;
      this.ename=ename;
      }
	  public void mail(){
		  System.out.println("mail"+ename);
	  }
}
class SerializableDemo{
	public static void main(String[] args) throws Exception{
		Employee e=new Employee(101,"gopal");
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
        fos.close();
		oos.close();
	}



}
