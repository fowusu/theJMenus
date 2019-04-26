package theJmenus;


import javax.swing.*;

public class NewMenu {

	
	public static void main(String abc[]) {
		
		JFrame Win = new JFrame(); 
		
		JMenuBar MenuBar = new JMenuBar();
		
		JMenu Menu1 = new JMenu("Farhan");
		JMenu Menu2 = new JMenu("Record");
		
		JMenuItem M1 = new JMenu("New");
		JMenuItem M2 = new JMenu("ABC");
		
		JMenuItem M3 = new JMenu("ENTER");
		JMenuItem M4 = new JMenu("VIEW");
		
		Menu1.add(M1); 
		Menu1.add(M2);
		
		Menu2.add(M3); 
		Menu2.add(M4);
		
		MenuBar.add(Menu1);
		MenuBar.add(Menu2);
		
		Win.setSize(400,400);
		Win.setJMenuBar(MenuBar);
		Win.setVisible(true);
		
		final JOptionPane optionPane = new JOptionPane(
			    "The only way to close this dialog is by\n"
			    + "pressing one of the following buttons.\n"
			    + "Do you understand?",
			    JOptionPane.QUESTION_MESSAGE,
			    JOptionPane.YES_NO_OPTION);
		
	}
	
}
