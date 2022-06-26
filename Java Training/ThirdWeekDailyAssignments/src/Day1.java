//Write java code store list of Internet plan objects in different List collections and write a method sort based on plan price
import java.util.*;
public class Day1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("100 Mbps at Rs.699 monthly");
		list.add("250 Mbps at Rs.1299 monthly");
		list.add("500 Mbps at Rs.2499 monthly");
		list.add("1 Gbps at Rs.3999 monthly");
		System.out.println("Jio Fiber Internet Plans, Based on Prices");
		System.out.println("ArrayList before sorting: " + list);
		Collections.sort(list);
		System.out.println("ArrayList after sorting: " + list);
		
		List<String> list1 = new LinkedList<String>();
		list1.add("60 Mbps at 1299 Rupees/month");
		list1.add("40 Mbps at Rs.1050 monthly");
		list1.add("10 Mbps at Rs.650 monthly");
		list1.add("1 Mbps at Rs.410 monthly");
		System.out.println("ACT Broadband Internet Plans, Based on Prices");
		System.out.println("LinkedList before sorting: " + list1);
		Collections.sort(list1);
		System.out.println("LinkedList after sorting: " + list1);
		
		
		List<String> list2 = new Vector<String>();
		list2.add("100 Mbps at 16,999 Rupees/month");
		list2.add("50 Mbps at 9999 Rupees/month");
		list2.add("20 Mbps at 5999 Rupees/month");
		list2.add("10 Mbps at 3999 Rupees/month");
		System.out.println("BSNL Broadband Internet Plans, Based on Prices");
		System.out.println("Vector before sorting: " + list2);
		Collections.sort(list2);
		System.out.println("Vector after sorting: " + list2);
		
		Stack<String> list3 = new Stack<String>();
		list3.push("100 Mbps at 16,999 Rupees/month");
		list3.push("50 Mbps at 9999 Rupees/month");
		list3.push("20 Mbps at 5999 Rupees/month");
		list3.push("10 Mbps at 3999 Rupees/month");
		System.out.println("YOU Broadband Internet Plans, Based on Prices");
		System.out.println("Stack before sorting: " + list3);
		Collections.sort(list3);
		System.out.println("Stack after sorting: " + list3);
		
		
		
}
}