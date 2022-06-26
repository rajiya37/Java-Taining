import java.util.*;

//Write code to use method with and without backed collections
public class Day4 {

	public static void main(String[] args) {
		try {
			Integer a[] = new Integer[] { 10, 20, 30, 40 };
			List<Integer> list = Arrays.asList(a);
			System.out.println("The list is: " + list);
		}catch(Exception e) {
			System.out.println("Exception thrown : " + e);
		}
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(20);
		s.add(12);
		s.add(34);
		s.add(2);
		s.add(45);
		System.out.println(s);
		System.out.println("Head Set: "+s.headSet(20, true));
		 System.out.println("SubSet: "+s.subSet(2, false, 40, true));  
		 System.out.println("TailSet: "+s.tailSet(20, false));  
		 
		 TreeMap<Integer,String> m = new TreeMap<Integer,String>();
			m.put(1,"In Time Tec");
			m.put(2,"Infosys");
			m.put(3,"Wipro");
			m.put(4,"Tcs");
			m.put(5,"Cts");
			System.out.println(m);
			System.out.println("Head Map: "+m.headMap(3, true));
			 System.out.println("SubMap: "+m.subMap(2, false, 4, true));  
			 System.out.println("TailMap: "+m.tailMap(2, false));  
		
	}

}
//These methods return Backed Collection headSet(),subSet(),tailSet(),headMap(),SubMap(),tailMap()
//And By using Arrays.asList() returns a list backed by the array,because it doesn't make a copy.