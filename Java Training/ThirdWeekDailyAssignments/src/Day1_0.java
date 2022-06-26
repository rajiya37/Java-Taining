//Write a program for collections w/ and w/o Generics
import java.util.*;
public class Day1_0 {

	public static void main(String[] args) {
		//  Without Generics, we can store any type of objects.
		//Before Generics, we need to type cast.
		List list = new ArrayList(); 
		list.add("In Time Tec");
		list.add(10);
		list.add(true);
		list.add(12.90);
		String s = (String) list.get(0);//type casting 
		System.out.println("Collections Without Generics:");
		System.out.println(list);
		System.out.println(s);
		//With Generics, it is required to specify the type of object we need to store.  
		ArrayList<String> list1 = new ArrayList<String>();    
		list1.add("Shaik");  
		list1.add("Rajiya");
		list1.add("Begum");  
		list1.add("In Time Tec");
//		list1.add(10);//compile time error
		System.out.println("Collections With Generics:");
		System.out.println(list1);
		String s1 = list1.get(0);    
		System.out.println(s1);
		

	}

}
