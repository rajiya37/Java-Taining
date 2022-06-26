class Constructor{
	int sum;
	Constructor(){
		this(7, 8);
		System.out.println("Default Constructor");
		
	}
	Constructor(int a, int b){
		System.out.println("Constructor with parameters");
		this.sum=(a+b);
		}
	void show() {
		System.out.println("Sum:"+ sum);
	}
}
public class Day5_1 {

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.show();
	}

}
