import java.sql.*;
import java.io.*;
interface EmployeeDetails{

}
class HRDashBoard implements EmployeeDetails{
	  public HRDashBoard(String filename)throws Exception{
		  updatedata(filename);
	  }
	  private void updatedata(String filename)throws Exception{
		  String driverclass="com.mysql.cj.jdbc.Driver";
		  String path="jdbc:mysql://localhost:3306/employee";
		  String username="root";
		  String password="manmeet@0201";
		  Class .forName(driverclass);
		  Connection con=DriverManager.getConnection(path,username,password);
          File f=new File(filename);
		  FileReader fr=new FileReader(f);
		  BufferedReader br=new BufferedReader(fr);
		  String d=br.readLine();
		  while(d!=null){
			  String[] arr=d.split(" ");
			  Statement stmt=con.createStatement();
			  int eid=Integer.parseInt(arr[0]);
			  String ename=arr[1]+" "+arr[2];
			  String gender=arr[3];
			  String dept=arr[4]+"";
			  String sal=arr[5];
			 double sal1;
			  if(sal==null||sal.equals(null)){

                   sal1=0.0;
			  }
			  else{
			  sal1=Float.parseFloat(sal.replaceAll("$",""));
			  }
			  String email=arr[7];
			  System.out.println(+eid+"','"+ename+"','"+gender+"','"+dept+"','"+sal1+"','"+email);
			  String sqlquery="insert into emp values("+eid+"','"+ename+"','"+gender+"','"+dept+"','"+sal1+"','"+email+");";
			  int i=stmt.executeUpdate(sqlquery);
			  System.out.println(i);
             d=br.readLine();


		  }
	  }
      public static void main(String[] args)throws Exception{
		  HRDashBoard emp=new HRDashBoard("EMPKMIT.csv");
	  }
}

   