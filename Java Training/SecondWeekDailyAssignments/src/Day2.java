
public class Day2 {

	public static void main(String[] args) {
		try {String s=null;
			System.out.println(s.length());
		}catch(Exception e) {
			e.printStackTrace();
		}//catch(NullPointerException e) {
			
		}

	}

//}
//No,it is not possible to catch Exception before catching NullPointerException in single try-catch block.
//Compile time error:exception NullPointerException has already been caught catch(NullPointerException e){