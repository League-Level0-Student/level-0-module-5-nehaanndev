package _01_algorithms._2_fibonacci;

public class fibonacci {

	public static void main (String [] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.print(num1);
		System.out.print(num2);
		
		for (int i = 0; i<10; i++) {
			System.out.print(num1+num2);
			num3 = num1;
			num1 = num2;
			num2 = num1+ num3;
		}
	}
}
