//Add user-defined/custom exceptions in ISP Management Application.
class InternetIsAvailableException extends Exception{
	InternetIsAvailableException(String msg){
		System.out.println(msg);
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		try {
		ispManagementApplication("internet");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void ispManagementApplication(String s) throws  InternetIsAvailableException{
		if(s == "internet") {
			throw new InternetIsAvailableException("Internet is not Available");
		}
		else {
			System.out.println("Internet is Available");
		}
	}

}
