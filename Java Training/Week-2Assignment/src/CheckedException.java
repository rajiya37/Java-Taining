//Add Checked and UncheckedException in ISP Management Applications
import java.io.*;
public class CheckedException {

	public static void main(String[] args) {
		readFile();
		   }
	//Checked Exception
	public static  void readFile() {
		        String customerName = "customer does not exist"; 
		        File obj = new File(customerName);
		        try {
		            FileInputStream f = new FileInputStream(obj); 
		        }
		        catch (FileNotFoundException e) {
		            e.printStackTrace();
		        }
		    }
	
}
