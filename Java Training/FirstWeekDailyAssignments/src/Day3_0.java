import java.util.Scanner;

public class Day3_0 {

	public static void main(String[] args) {
		System.out.println("Different Subscriptions plans ");
		Scanner sc = new Scanner(System.in);
		int days =sc.nextInt();
		if(days>84) {
			System.out.println("It is 84Days Plan");
		}
		else if(days>56){
			System.out.println("It is 56Days Plan");
		}else if(days>28) {
			System.out.println("it is 28Days plan");
		}else {
			System.out.println("It is WFH Plan");
		}
		

	}

}
