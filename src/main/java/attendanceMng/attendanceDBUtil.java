package attendanceMng;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class attendanceDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	static String EID;
	
	public static List<employee> validate(String attendanceID) {
		
		ArrayList<employee> emp = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/company";
	    String user = "root";
	    String pass = "she#123mypro";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			//con = DBconnection.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select * from attendance where attendanceID='"+attendanceID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				
				String attendanceid = rs.getString(1);
				String eid = rs.getString(2);
				String date = rs.getString(3);
				String loginTime = rs.getString(4);
				String logoutTime = rs.getString(5);
				
				employee e = new employee(attendanceid, eid, date, loginTime, logoutTime);
				emp.add(e);
				
			} else {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	//implement get employee details method
	public static List<employee> getemployee(String attendanceId) {
		
		String Eid = EID;
		
		ArrayList<employee> emp = new ArrayList<>();
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from attendance where eid='"+Eid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				String attendanceID = rs.getString(1);
				String eid = rs.getString(2);
				String date = rs.getString(3);
				String loginTime = rs.getString(4);
				String logoutTime = rs.getString(5);

				
				
				employee Emp = new employee (attendanceID,eid,date,loginTime,logoutTime);
				emp.add(Emp);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return emp;
	}

    
    // Store attendance data in the database 
    public static boolean insertAttendance(String attendanceID,String eid, String date, String loginTime, String logoutTime) {
        boolean isSuccess = false;
       
        
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "she#123mypro";
        
        try {
        	
        	con = DBconnection.getConnection();
        	stmt = con.createStatement();
        	
        	//sql query for insert data into database
        	String sql = "insert into attendance values ('"+attendanceID+"','"+eid+"','"+date+"', '"+loginTime+"', '"+logoutTime+"')";
        	int rs = stmt.executeUpdate(sql);
        	
        	if(rs > 0) {
        		isSuccess = true;
        	}else {
        		isSuccess = false;
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        
        return isSuccess;
    }
    
    //implement update details method
   public static boolean updateAttendance(String attendanceID, String eid, String date, String loginTime, String logoutTime ) {
	   
	   
	   String url = "jdbc:mysql://localhost:3306/company";
       String user = "root";
       String pass = "she#123mypro";
	   
     try {
    	 
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		//con = DBconnection.getConnection();
		Statement stmt = con.createStatement();
		
		//sql query for update database
		String sql = "update attendance set eid='"+eid+"',date='"+date+"', loginTime='"+loginTime+"', logoutTime='"+logoutTime+"' where id='"+attendanceID+"'";
       
       int rs = stmt.executeUpdate(sql);
       
       if(rs>0) {
    	   isSuccess= true;
    	   
       }else {
    	   
    	   isSuccess = false;
       }
       
       
     }catch(Exception e){
    	 
    	 e.printStackTrace();
     }
       
       
       return isSuccess;
	   
   }
   
   public static List<employee> getAttendanceDetails(String attendanceID){
	   
	   ArrayList<employee> attendance = new ArrayList();
	   
	   try {
		   
		   con = DBconnection.getConnection();
		   stmt = con.createStatement();
		   
		   //sql query for retrieve data from database
		   String sql = "select * from attendance where id='"+attendanceID+"'";
		   rs = stmt.executeQuery(sql);
		   
		   while(rs.next()) {
			   String attID = rs.getString(1);
			   String eid = rs.getString(2);
			   String date = rs.getString(3);
			   String logint = rs.getString(4);
			   String logoutt = rs.getString(5);
			   
			   
			   employee e = new employee(attID, eid, date, logint, logoutt);
			   
			   attendance.add(e);
		   }
		      
	   }catch(Exception e) {
		   
		   e.printStackTrace();
	   }
	   
	   return attendance;
	   
   }

   //implement method for delete 
   public static boolean deleteAttendance(String attendanceID) {
	   
	   try {
		   
		   con = DBconnection.getConnection();
		   stmt = con.createStatement();
		   
		   //sql query for delete data from the database
		   String sql = "delete from attendance where attendanceID='"+attendanceID+"'";
		   int rs = stmt.executeUpdate(sql);
		   
		   
		   if(rs>0) {
	    	   isSuccess= true;
	    	   
	       }else {
	    	   
	    	   isSuccess = false;
	       }
		   
		   
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   return isSuccess;
	   
   }


}
