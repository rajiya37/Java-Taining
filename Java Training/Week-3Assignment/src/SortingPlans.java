//Sorts plans based on different parameters(price low to high, speed low to high, type 2g,4g,5g)
import java.util.*;
public class SortingPlans {

	public static void main(String[] args) {
		TreeSet<InternetPlans1> set = new TreeSet<InternetPlans1>(new myPriceComparator());
		set.add(new InternetPlans1(9999,"10Gbps","5G"));
        set.add(new InternetPlans1(5999,"1000Mbps","2G"));
        set.add(new InternetPlans1(7999,"1Gbps","4G"));
        
        System.out.println("Sorting with the Price");
        for(InternetPlans1 i: set)
        {
            System.out.print(i.getSpeed()+" "+i.getPrice()+" "+i.getType());
            System.out.println();
        }
        
        TreeSet<InternetPlans1> set1= new TreeSet<InternetPlans1>(new mySpeedComparator());
        
        set1.add(new InternetPlans1(9999,"10Gbps","5G"));
        set1.add(new InternetPlans1(7999,"1Gbps","4G"));
        set1.add(new InternetPlans1(5999,"1000Mbps","2G"));
        
        System.out.println("--------------------------------------------"); 
        System.out.println("Sorting with the Type");
         
        for(InternetPlans1 ele : set1)
        {
            System.out.print(ele.getSpeed() +" "+ ele.getType()+" "+ele.getPrice());
            System.out.println();
        }
TreeSet<InternetPlans1> set2= new TreeSet<InternetPlans1>(new myTypeComparator());
        
        set2.add(new InternetPlans1(9999,"10Gbps","5G"));
        set2.add(new InternetPlans1(7999,"1Gbps","4G"));
        set2.add(new InternetPlans1(5999,"1000Mbps","2G"));
        
        System.out.println("--------------------------------------------"); 
        System.out.println("Sorting With The Speed");
         
        for(InternetPlans1 e : set2)
        {
            System.out.print(e.getSpeed() +" "+ e.getType()+" "+e.getPrice());
            System.out.println();
        }
	}

}
class InternetPlans1{
	   
    private int price;
    private String Speed;
    private String type;
   
    
    public InternetPlans1(int price, String speed,String type)
    {
        this.price=price;
        this.Speed=speed;
        this.type=type;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price= price;
    }
     
    public String getSpeed()
    {
        return Speed;
    }
    public void setSpeed(String speed)
    {
        this.Speed= speed;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type= type;
    }
	@Override
	public String toString() {
		return "InternetPlans1 [price=" + price + ", Speed=" + Speed + ", type=" + type + "]";
	}
    
}
class myPriceComparator implements Comparator<InternetPlans1>
{
   
    public int compare(InternetPlans1 s1, InternetPlans1 s2)
    {
        return s1.getPrice()-s2.getPrice();
    }
}
 
class myTypeComparator implements Comparator<InternetPlans1>
{
    public int compare(InternetPlans1 s1, InternetPlans1 s2)
    {
        return s1.getType().compareTo(s2.getType());
    }
}
class mySpeedComparator implements Comparator<InternetPlans1>
{
    public int compare(InternetPlans1 s1, InternetPlans1 s2)
    {
        return s1.getSpeed().compareTo(s2.getSpeed());
    }
}