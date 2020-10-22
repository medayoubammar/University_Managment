//package crud;

//import java.sql.*;

//public class StudentSQL {

	/*public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("mySqlDriver");
			String url="jdbc:mysql://127.0.0.1/crudjavaee";
			
			
			
			con = DriverManager.getConnection(url, "root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
		return con;
		
		
	}
	
	
	public static int save(Student s) {
		int st = 0;
		
		try {
			String sql="INSERT INTO `student`(`name`, `password`, `email`, `country`) VALUES (?,?,?,?)";
			Connection con = StudentSQL.getConnection();
			PreparedStatement prSt = con.prepareStatement(sql);
			prSt.setString(1, s.getName());
			prSt.setString(2, s.getPassword());
			prSt.setString(3, s.getEmail());
			prSt.setString(4, s.getCountry());
			st = prSt.executeUpdate();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
		
	}*/
	
	
//}
