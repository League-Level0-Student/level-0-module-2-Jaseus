package random;

import java.util.Random;

import javax.swing.JOptionPane;
// *THIS IS INCOMPLETE*
public class HiLow {
public static void main(String[] args) {
	
	Random randomMaker = new Random();
	int randomNumber = randomMaker.nextInt(101);
	
	boolean Cont = true;
	while (Cont == true) {
	
	
	String number = JOptionPane.showInputDialog("Guess an integer from 0-100");
		int num = Integer.parseInt(number);
		
		if(num == randomNumber) {
			Cont = false;
			JOptionPane.showMessageDialog(null, "Correct! The number was " + randomNumber);
		}
		
				if(num < randomNumber) {
					JOptionPane.showMessageDialog(null, "Incorrect. Guess a higher number");

				}
				
				if(num > randomNumber) {
					JOptionPane.showMessageDialog(null, "Incorrect. Guess a lower number");
				}
			}
			
}
}

