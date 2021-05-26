/*Complete the below program on your machines
below code is for reference
*/

import java.sql.*;
import java.io.*;
interface Sun_HRM{
	String  getHighestRatioOfFemalesInDept();
	void mailUpdatedSalary();
}
/*interface Health_Benefits{
	String[] getObeseEmp	loyees();
}*/
class EmployeeService implements Sun_HRM{

	EmployeeService (String filename){
		uploadData(filename);		
	}
	void  connectToDB(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cse","root","root");
			Statement stmt = null;
			BufferedReader br = new BufferedReader(new FileReader(new File("emp.csv")));
			String data= br.readLine();
			ResultSet rs = null;
			while(data!=null){
				String emp[] = data.split(",");
				 stmt = con.createStatement();
				 System.out.print(emp[4]);
				 rs = stmt.executeQuery("Select * from dept where dname = '"+emp[4]+"'");
				if(rs.next())
				{
				System.out.println(rs.getInt("did"));
				int sal = Integer.parseInt(emp[5].replaceAll("$",""));
				boolean query = stmt.execute("insert into Employee (eid,ename,did,salary,email,rating) values("+emp[0]+", "+emp[1]+" "+emp[2]+","+ rs.getInt("did")+"," +sal+","+ "'gmail'"+","+ emp[10]+")");
				}
				data= br.readLine();

			}			
			
		}catch(SQLException sqe){
			sqe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	private void uploadData(String filename){
			connectToDB();
	}
	public String  getHighestRatioOfFemalesInDept(){
		return "";
	}
	public void mailUpdatedSalary(){
		
	}
	/*public String[] getObeseEmployees(){
	
	}*/
}
class Test3{
	public static void main(String []args){
		EmployeeService es = new EmployeeService("sql.csv");		
	}
}
