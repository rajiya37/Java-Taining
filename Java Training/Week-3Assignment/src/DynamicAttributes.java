//Searches for a plan based on dynamic attributes(price, speed, validity)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class DynamicAttributes {

	public static void main(String[] args) {
		List<InternetPlans> list = new ArrayList<InternetPlans>();
		list.add(new InternetPlans("speed upto 30 Mbps","30Days",399));
		list.add(new InternetPlans("speed upto 100 Mbps","7Days",199));
		list.add(new InternetPlans("speed upto 100 Mbps","30Days",699));
		list.add(new InternetPlans("speed upto 150 Mbps","30Days",999));
		list.add(new InternetPlans("speed upto 30 Mbps","90Days",1197));
		list.add(new InternetPlans("speed upto 100 Mbps"," 90Days ",2097));
		list.add(new InternetPlans("speed upto 30 Mbps","180Days",2394));
		System.out.println("Jio Fiber Internet Plans");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Searching Internet Plans Based on Price,Speed and validity");
		List<InternetPlans> l=list.stream().filter(i->i.getPrice()>2097).collect(Collectors.toList());
		System.out.println(l);
		}

}
class InternetPlans{
	private String speed;
	private String validity;
	private int price;
	
	public InternetPlans(String speed,String validity,int price) {
		this.speed=speed;
		this.validity=validity;
		this.price=price;
		}
		
		public String getSpeed() {
			return speed;
		}
		public void setSpeed(String speed) {
			this.speed=speed;
		}
		
		public String getValidity() {
			return validity;
		}
		public void setValidity(String validity) {
			this.validity=validity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price=price;
		}

		@Override
		public String toString() {
			return "InternetPlans [speed=" + speed + ", validity=" + validity + ", price=" + price + "]";
		}
		
	}
	
