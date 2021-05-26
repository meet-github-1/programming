import java.io.Serializable;
import java.io.*;
class Employee implements Serializable{//marker interface class
    int empid;
    String ename;
	static String org;
	transient String dept;//it is also a modifier 
	//it is only for varialbles 
	//if we donot want to serialize any variable
    Employee(int id,String ename){
		System.out.println("constructor called");
      empid=id;
      this.ename=ename;
	  org="kmit";
	  dept="cse";
      }
	  public void mail(){
		  System.out.println("mail"+ename);
	  }
}
class serial{
	public static void main(String[] args) throws Exception{
		Employee e=new Employee(101,"gopal");
		FileOutputStream fos=new FileOutputStream("emp.ser");//static variable does not get serialized
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
        fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream os=new ObjectInputStream(fis);
	    e=(Employee)os.readObject();
		fis.close();
		os.close();
		System.out.println(e.empid+" "+e.ename+" "+e.org+" "+e.dept);



	}



}

