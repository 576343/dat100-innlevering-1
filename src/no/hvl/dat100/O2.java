package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		String input = showInputDialog("Inntekt:");
		int inntekt = (Integer.parseInt(input));
		double skatt = 0.0;
		
		if (inntekt > 208_050) {
			skatt += (inntekt - 208_050)*(0.017);
		}
		if (inntekt > 292_850) {
			skatt += (inntekt - 292_850)*(0.04-0.017);
		}
		if (inntekt > 670_000) {
			skatt += (inntekt - 670_000)*(0.136-0.04);
		}
		if (inntekt > 937_900) {
			skatt += (inntekt - 937_900)*(0.166-0.136);
		}
		if (inntekt > 1_350_000) {
			skatt += (inntekt - 1_350_000)*(0.176-0.166);
		}
		
		System.out.println("Total skatt: " + skatt);
	}

}
