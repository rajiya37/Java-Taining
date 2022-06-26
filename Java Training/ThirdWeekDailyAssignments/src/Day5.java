import java.util.*;
import java.util.stream.Collectors;
//Write code to search through all the Internet plans according to price and speed requirements (use streams to do this)
public class Day5 {
	public static void main(String[] args) {
		List<InternetPlansExample> list= new ArrayList<InternetPlansExample>();
		
		list.add(new InternetPlansExample("30 Mbps at",399));
		list.add(new InternetPlansExample("100 Mbps at",699));
		list.add(new InternetPlansExample("150 Mbps at",999));
		list.add(new InternetPlansExample("300 Mbps at",1499));
		list.add(new InternetPlansExample("500 Mbps at",2499));
		list.add(new InternetPlansExample("1 Gbps at",3999));
		list.add(new InternetPlansExample("1 Gbps at",8499));
		
			System.out.println("Jio Fiber Internet Plans, Based on Prices and Speeds");
			List<InternetPlansExample> l=list.stream().filter(i->i.getCost()>=2000).collect(Collectors.toList());
			System.out.println(l);
			}

}
class InternetPlansExample{
	private String speed; 
	private int cost;
	
	public InternetPlansExample(String speed,int cost) {
		this.speed=speed;
		this.cost=cost;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed=speed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "InternetPlansExample [speed=" + speed + ", cost=" + cost + "]";
	}
	
}