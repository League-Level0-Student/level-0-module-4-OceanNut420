package _10_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happ = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String dog = JOptionPane.showInputDialog("wat pet u want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for(int i = 0; i < 100000; i++) {
		int task = JOptionPane.showOptionDialog(null, "wat do to make pet happy?", "Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "brush teeth", "lick", "make pet wash dishes" },
				null);
		// 5. Use user input to call the appropriate method created in step 4.
		if (task == 0) {
			brushteeth();
		} else if (task == 1) {
			lick();
		} else if(task == 2) {
			makedogwashdishes();
		}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (happ == 30) {
			JOptionPane.showMessageDialog(null, "u luv ur " + dog);
			break;
		}
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void brushteeth() {
		JOptionPane.showMessageDialog(null, "pet is thiccer");
		happ = happ + 5;
	}

	static void lick() {
		JOptionPane.showMessageDialog(null, "pet is sad");
		happ = happ + 1;
	}

	static void makedogwashdishes() {
		JOptionPane.showMessageDialog(null, "pet is big thicc happy");
		happ = happ + 10;
	}
}