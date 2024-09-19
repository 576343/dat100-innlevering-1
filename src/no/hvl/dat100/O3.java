package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		String input = showInputDialog("skriv inn ett heltall:");
		int n = (Integer.parseInt(input));
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println(n + "! = " + sum);
	}
}
