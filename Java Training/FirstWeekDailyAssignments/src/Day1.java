import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			 arr[i] =sc.nextInt();
			 }
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		 
		int arr1[]=arr.clone();
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
		}

	}

}
