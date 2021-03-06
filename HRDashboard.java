import java.sql.*;
import java.io.*;
interface EmployeeDetails
{
	void gethighestnumberoffemales();
	void getHighestPaidEmployee();
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
		  Class.forName(driverclass);
		  Connection con=DriverManager.getConnection(path,username,password);
          File f=new File(filename);
		  FileReader fr=new FileReader(f);
		  BufferedReader br=new BufferedReader(fr);
		  String d=br.readLine();
		  d=br.readLine();
		  while(d!=null){
			  String[] arr=d.split(",");
			  Statement stmt=con.createStatement();
			  //System.out.println(arr[0]);
			  if(arr[0].equals("")){
				  break;
			  }
			  int eid=Integer.parseInt(arr[0]);
			  String ename=arr[1]+" "+arr[2];
			  String gender=arr[3];
			  String dept=arr[4]+"";
			  String sal=arr[5];
			 double sal1;
			 String email="";
			 //System.out.println(arr[0]+"','"+arr[1]+" "+arr[2]+"','"+arr[3]+"','"+arr[4]+"','"+arr[5]+"','"+arr[7]);
			  if(sal==null||sal.equals(null)){

                   sal1=0.0;
				   email=arr[7];
			  }
			  else{
              if(!arr[5].equals("")){
			  sal=arr[5].substring(2);
			  sal1=Float.parseFloat(sal);
			  email=arr[7];
			  }
			  else{
				  sal1=0.0;
				  email=arr[6];
			  }
			  }
			  String sqlquery="insert into emp values("+eid+",'"+ename+"','"+gender+"','"+dept+"',"+sal1+",'"+email+"');";
			  int i=stmt.executeUpdate(sqlquery);
			  //System.out.println(i);
             d=br.readLine();


		  }
	  }
 public void gethighestnumberoffemales()
	{
	   //connect to db
	   try{
	   String driverClass="com.mysql.cj.jdbc.Driver";
			String path = "jdbc:mysql://localhost:3306/employee";
			//Please specify your own server details
			String username  ="root";
			String password = "manmeet@0201";
			Class.forName(driverClass);  
			Connection con = DriverManager.getConnection(path,username,password);
			Statement stmt = con.createStatement();
			//execute query should be used for SELECT statements
			ResultSet rs = stmt.executeQuery("select count(e.ename),e.dept from emp e where e.gender='F' group by e.dept having count(*)>=0;");
	        //When result set is returned it always point before first row 
			int max=0;
			String prev="";
	        while(rs.next() != false)
	        {
	            if(rs.getInt(1)>max){
					max=rs.getInt(1);
					prev=rs.getString(2);
				}
	        }
			System.out.print(max+" ");
			System.out.println(prev);
	   }

	   catch(Exception e){
		   System.out.println(e.getMessage());
	   }
	  }
	  public void getHighestPaidEmployee(){
		   try{
	   String driverClass="com.mysql.cj.jdbc.Driver";
			String path = "jdbc:mysql://localhost:3306/employee";
			//Please specify your own server details
			String username  ="root";
			String password = "manmeet@0201";
			Class.forName(driverClass);  
			Connection con = DriverManager.getConnection(path,username,password);
			Statement stmt = con.createStatement();
			//execute query should be used for SELECT statements
			ResultSet rs = stmt.executeQuery("select * from emp e where e.salary in(select max(salary) from emp)");
	        //When result set is returned it always point before first row 
	        System.out.println();
			rs.next();
	        System.out.print(rs.getInt(1)+" ");
	        System.out.print(rs.getString(2)+" ");
	        System.out.print(rs.getString(3)+" ");
	        System.out.print(rs.getString(4)+" ");
	        System.out.print(rs.getFloat(5)+" ");
	        System.out.print(rs.getString(6)+" ");
	        
	   }
	   catch(Exception e){
		   System.out.println(e.getMessage());
	   }
	  }
      public static void main(String[] args)throws Exception{
		  HRDashBoard emp=new HRDashBoard("EMPKMIT.csv");
		  emp.gethighestnumberoffemales();
		  emp.getHighestPaidEmployee();
	  }
}

   