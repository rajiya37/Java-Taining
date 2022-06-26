//For the same problem above, use set instead of list and prevent adding duplicates to the set
import java.util.*;
public class Day2 {

	public static void main(String[] args) {
		
		TreeSet<String> list = new TreeSet<String>();
		list.add("100 Mbps at Rs.699 monthly");
		list.add("100 Mbps at Rs.699 monthly");
		list.add("250 Mbps at Rs.1299 monthly");
		list.add("500 Mbps at Rs.2499 monthly");
		list.add("500 Mbps at Rs.2499 monthly");
		list.add("1 Gbps at Rs.3999 monthly");
		System.out.println("Jio Fiber Internet Plans, Based on Prices");
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
		HashSet<String> list1 = new HashSet<String>();
		list1.add("60 Mbps at 1299 Rupees/month");
		list1.add("60 Mbps at 1299 Rupees/month");
		list1.add("40 Mbps at Rs.1050 monthly");
		list1.add("10 Mbps at Rs.650 monthly");
		list1.add("1 Mbps at Rs.410 monthly");
		list1.add("1 Mbps at Rs.410 monthly");
		System.out.println("ACT Broadband Internet Plans, Based on Prices");
		Iterator<String> itr1=list1.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}  
		
		}

		
	}


