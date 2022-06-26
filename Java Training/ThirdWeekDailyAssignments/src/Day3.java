//Write a program to search set or map of internet plan objects for internet plans that fits the customer price requirements.


//eg; if there are 3 plans (600, 800, 1000). if customer searches for 900, it should show 800 and 1000 plans

import java.util.*;
public class Day3 {

	public static void main(String[] args) {
		NavigableSet<String> data = new TreeSet<String>();
		data.add("100 Mbps at Rs.699 monthly");
		data.add("100 Mbps at Rs.899 monthly");
		data.add("250 Mbps at Rs.1299 monthly");
		data.add("500 Mbps at Rs.2499 monthly");
		data.add("500 Mbps at Rs.2999 monthly");
		data.add("1 Gbps at Rs.3999 monthly");
		System.out.println("----TreeSet-----");
		System.out.println("Different Type of Internet Plans");
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Customer searches for 2500 Plans");
		
		
		System.out.println(data.lower("2500"));
		System.out.println(data.ceiling("2500"));
		
		

	}

}
