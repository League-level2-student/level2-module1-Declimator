package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton buttonone;
	JButton buttontwo;
	ArrayList<String> add;
	public static void main(String[] args) {
	GuestBook g = new GuestBook();
	g.guestbook();
	}
	public void guestbook(){
		add = new ArrayList<String>();
		frame = new JFrame();
		panel = new JPanel();
		buttonone = new JButton();
		buttontwo = new JButton();
		buttonone.addActionListener(this);
		buttontwo.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(buttonone);
		panel.add(buttontwo);
		buttonone.setText("Add Name");
		buttontwo.setText("View Names");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonone) {
			add.add(JOptionPane.showInputDialog("Add a name"));
		}
		else if(e.getSource()==buttontwo) {
			for(int i=0;i<add.size();i++){
				System.out.println("Guest #" + (i+1) + ":" + add.get(i));
			}
		}
	}

}
