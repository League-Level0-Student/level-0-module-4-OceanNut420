import javax.swing.JOptionPane;

public class primeornoteeeee {
	public static void main(String[] args) {
String noombur = JOptionPane.showInputDialog("give number");
int nombur = Integer.parseInt(noombur);
boolean something = false;
for(int i = 2; i < nombur; i++) {
	if(nombur % i == 0) {
		something = true;
	}
	
	}
	if(something == true) {
		JOptionPane.showMessageDialog(null, "not prime");
	}
	else {
		JOptionPane.showMessageDialog(null, "prime");
	}
	
	
	
}
}
