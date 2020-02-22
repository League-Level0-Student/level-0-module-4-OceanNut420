package _06_test_scores;

import javax.swing.JOptionPane;

public class testscores {

	public static void main(String[] args) {
	String momscore = JOptionPane.showInputDialog("wat ur test score?");
	double mothersad = Double.parseDouble(momscore);
		if(mothersad > 100) {
			JOptionPane.showMessageDialog(null, "your grades are terrible. work harder.");
		}
		if(mothersad < 101 && mothersad > 80) {
			JOptionPane.showMessageDialog(null, "wow cool i wish i had that.");
		}
		if(mothersad < 80) {
			JOptionPane.showMessageDialog(null, "wow how grade so good");
		}
	}

}
