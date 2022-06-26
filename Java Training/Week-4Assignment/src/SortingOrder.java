//Write database logic to retrieve plans on different sorting order(the query should be dynamic to take any parameter(speed, price) for sorting)


import java.sql.*;
public class SortingOrder {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	      String url="jdbc:mysql://localhost:3306/InternetServiceProvider";
	       String uname="root";
	       String pass="rootpassword";
	       Connection con = DriverManager.getConnection(url,uname,pass);
		

	     Statement st = con.createStatement();
	     String query="select * from internetservice ORDER BY price DESC";
	    ResultSet rs = st.executeQuery(query);
	    System.out.println("The Data is sorted by Price:");
	    System.out.println("------------------------------------");
	    while( rs.next()) {
		String data=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4);
		
		System.out.println(data);
		}
	    
	     st.close();
	    con.close();
	}

}
