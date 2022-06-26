
public class Day3_1 {

	public static void main(String[] args) {
		String str = "intimetec";
		char Array[]=str.toCharArray();
		int count=0;
		System.out.println("Duplicate Characters are:");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(Array[i]==Array[j]) {
					System.out.println(Array[j]);
				}
				count++;
			
			}
		}

	}

}
