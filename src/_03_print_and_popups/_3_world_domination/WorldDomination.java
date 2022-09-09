package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String sus = JOptionPane.showInputDialog("do you no how to write code? type yes or no. if you don't answer i'll will slap your cheeks");
		// 2. If they say "yes", tell them they will rule the world.
		if (sus.equals ("yes")) {
		JOptionPane.showMessageDialog(null, "you will dominate the world but im still going to slap your cheeks");	
			
			
			
			
		}
		else {
	 JOptionPane.showMessageDialog(null, "you r bad imma go track you down and thow you in the trash-- or you can sign up for The League");	
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

