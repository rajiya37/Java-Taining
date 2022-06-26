public class Day1 {
     Day1 i;
	public static void main(String[] args) {
		Day1 obj1= new Day1();
		Day1 obj2= new Day1();
		Day1 obj3=new Day1();
		obj1.i=obj2;
		obj2.i=obj3;
		obj3.i=obj1;
		obj1=null;
		obj2=null;
		obj3=null; //(3 objects are eligible for Garbage collection)
		
	}

}