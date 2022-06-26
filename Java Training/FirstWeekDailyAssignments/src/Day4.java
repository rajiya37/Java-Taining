
class PrimeUsers{
	void videos() {
		System.out.println("Access to Prime Videos to Prime Users");
	}
	void shipping() {
		System.out.println("Shipping of Marked Goods is Charging Some Amount");
	}
	
}
class AmazonPrimeUsers extends PrimeUsers{
	void videos() {
		System.out.println("Access to Prime Videos to Amazon Prime Users");
	}
	void shipping() {
		System.out.println("Shipping of Marked Goods Is Free ");
	}
	void kindleLendingLibraryAndKindleFirsts() {
		System.out.println(" you can have free reading of up to two books each month ");
	}
	void music() {
		System.out.println("Access to Music to Amazon Prime Users");
	}
}
public class Day4 {

	
		public static void main(String[] args) {
			PrimeUsers obj=new AmazonPrimeUsers();//Up Casting
			obj.videos();
			obj.shipping();
			//obj.music();
			//obj.kindleLendingLibraryAndKindleFirsts();

	}

}
