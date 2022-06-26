//Stores Internet plans in a collection
import java.util.*;
public class StoresInternetPlans {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("speed upto 30 Mbps at ₹399 Monthly Plan for 30Days");
		list.add("speed upto 100 Mbps at ₹199 Monthly Plan for 7Days");
		list.add("speed upto 100 Mbps at ₹699 Monthly Plan for 30Days");
		list.add("speed upto 150 Mbps at ₹999 Monthly Plan for 30Days");
		list.add("speed upto 30 Mbps at ₹1197 Monthly Plan for 90Days");
		list.add("speed upto 100 Mbps at ₹2097 Monthly Plan for 90Days ");
		list.add("speed upto 30 Mbps  at ₹2394 Monthly Plan for 180Days");
		System.out.println("Jio Fiber Internet Plans");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
