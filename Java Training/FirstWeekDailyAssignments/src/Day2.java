import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int price=1500;//Account Price
		float d;
		System.out.println("Enter Your Account Type:");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if (a == 1) {
			System.out.println("Premium Account Users:");
		    System.out.println("For providing 20% discount to Premium plan Subscribers");
		    d=(price-((20f/100)*price));
		    System.out.println(d);
		} else if (a == 2) {
			System.out.println("Normal Account Users:");
		    System.out.println("For providing 5% discount to Normal plan Subscribers");
		    d=(price-((5f/100)*price));
		    System.out.println(d);}
		
	}

}
