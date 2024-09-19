package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int poengSum;
			do {
				String input = showInputDialog("Poengsum:");
				poengSum = (Integer.parseInt(input));
				if(poengSum >= 0 && poengSum <= 39) {
					System.out.println("F");
				} else if (poengSum >= 40 && poengSum <= 49) {
					System.out.println("E");
				} else if (poengSum >= 50 && poengSum <= 59) {
					System.out.println("D");
				} else if (poengSum >= 60 && poengSum <= 79) {
					System.out.println("C");
				} else if (poengSum >= 80 && poengSum <= 89) {
					System.out.println("B");
				} else if (poengSum >= 90 && poengSum <= 100) {
					System.out.println("A");
				} else {
					System.out.println("Ugyldig Verdi");
				}
			} while (poengSum < 0 || poengSum > 100);
		}
	}
}