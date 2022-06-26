//implement exception propagation
public class ExceptionPropagation {
	public static void main(String[] args) {
try {
	m1();
	}
catch(Exception e) {
	System.out.println("Exception is handled through main method....!");
	e.printStackTrace();
}
}
public static void m1() 
{
	m2();
	}
public static void m2() 
{ 
	String s=null;
System.out.println(s.length());
}

}
