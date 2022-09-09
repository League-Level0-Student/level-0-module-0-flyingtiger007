package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String one = JOptionPane.showInputDialog("is jake cool");		
		// 3.  Use an if statement to check if their answer is correct
if (one.equals("yes"))		{	
score += 1;	

}else {
	score -= 1;
}
				// 4.  if the user's answer was correct, add one to their score 
String two = JOptionPane.showInputDialog("what is 100!");		
// 3.  Use an if statement to check if their answer is correct
if (two.equals("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"))		{	
	JOptionPane.showMessageDialog(null, "you r ethier cracked at fornite or you do be cheating");
	score += 1;	

}else {
JOptionPane.showMessageDialog(null, "imagine getting this problem wrong could not be me also imagine not searching up the answer also could not have been me");
score -= 1;
}	
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
String three = JOptionPane.showInputDialog("is jake cool");		
// 3.  Use an if statement to check if their answer is correct
if (three.equals("yes"))		{	
score += 1;	

}else {
score -= 1;

}
JOptionPane.showMessageDialog(null, score);
// After all the questions have been asked, tell the user their final score 

	}
		}

