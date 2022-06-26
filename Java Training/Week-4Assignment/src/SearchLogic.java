//Write search logic using database query
import java.sql.*;
public class SearchLogic {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	      String url="jdbc:mysql://localhost:3306/InternetServiceProvider";
	       String uname="root";
	       String pass="rootpassword";
	       Connection con = DriverManager.getConnection(url,uname,pass);
		

	     Statement st = con.createStatement();
	     String query="select * from internetservice where plans LIKE 'c%' ";
	    ResultSet rs = st.executeQuery(query);
	   
	    while( rs.next()) {
		String data=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4);
		
		System.out.println(data);
		}
	    
	     st.close();
	    con.close();
	}

}
