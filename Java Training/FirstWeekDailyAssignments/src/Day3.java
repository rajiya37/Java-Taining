
public class Day3 {

	public static void main(String[] args) {
		String pw="password";
		char[] ch= new char[] {'p','a','s','s','w','o','r','d'};
		System.out.println("Password:"+pw);//Strings are immutable
		System.out.println("Password:"+ch);//safety purpose

	}

}
//Why string is not used for storing the passwords rather a char array is preferred for the same
//Strings are mutable.there are no methods defined that allow you to change(over write) after usage of String. 
//So String objects are unsuitable sorting security information such as user passwords.
//you should always collect and store security sensitive information in char array instead