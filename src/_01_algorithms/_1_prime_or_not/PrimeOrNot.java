package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (!isPrime ) {
			JOptionPane.showMessageDialog(null, " The number " + num + "is not a prime." );
		}else {
			JOptionPane.showMessageDialog(null, " The number " + num + " is a prime." );
		}
	}

}
