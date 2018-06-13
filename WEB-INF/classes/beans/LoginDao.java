package beans;

import dbcon.JDBCConn;
import java.sql.*;
 public class LoginDao {


	public static boolean validate(LoginBean bean)
	{
		boolean status=false;
		try{
			Connection con = JDBCConn.getConnection();
			
						PreparedStatement ps=con.prepareStatement("select * from user432 where email=? and pass=?");
			ps.setString(1,bean.getEmail());
			ps.setString(2, bean.getPass());
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e){}
			
		return status;
	}
 }
	/*public static void main(String[] args)
	{
		try{
			Connection con = JDBCConn.getConnection();
			
			//PreparedStatement ps=con.prepareStatement("select * from user432 where email=? and pass=?");
		//	ps.setString(1,bean.getEmail());
		//	ps.setString(2, bean.getPass());
			Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from user432");  

			//ResultSet rs=ps.executeQuery();
		//	status=rs.next();
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
		}catch(Exception e){}
		System.out.println("Connected..");
		
	}*/
	

