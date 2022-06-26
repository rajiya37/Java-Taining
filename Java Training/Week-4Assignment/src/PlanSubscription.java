// Write logic to crate plan subscription by taking customer and plan as input
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class PlanSubscription {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	      String url="jdbc:mysql://localhost:3306/InternetServiceProvider";
	       String uname="root";
	       String pass="rootpassword";
	       Connection con = DriverManager.getConnection(url,uname,pass);
		

	     PreparedStatement pst =con.prepareStatement( "insert into plansubscription values(?, ?)");
	   
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	     
	    	 System.out.println("Enter Customer Name");
	    	 String customer=br.readLine(); 
	    	 System.out.println("Enter Plan Name");
	    	 String plan=br.readLine();
	    	 pst.setString(1, "Shaik");
	    	 pst.setString(2, "Quaterly Plan");
	    	 int n=pst.executeUpdate();
	    	 System.out.println("Inserted records:"+n);
	     
	     
	    
	     
	     pst.close();
	    con.close();

	}

}
