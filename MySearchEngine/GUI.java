package MySearchEngine;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener{
	JLabel label1;
	JButton button1,button2;
	JPanel panel1;
	JTextField textfield1, textfield2, textfield3;
	
	public GUI(String title) {
		super(title);
		//Making the Frame Visible to the User
		setVisible(true);
		
		//Setting the Size of the Frame
		setSize(500,500);
		panel1=new JPanel();
		add(panel1);
		panel1.setBackground(Color.red);
		// Setting Layout of Panel
		setLayout(new FlowLayout());

		
		//Create TextFeild 1
		textfield1 =new JTextField("",16);
		panel1.add(textfield1);
		textfield1.setToolTipText("Enter the name of the person");
		textfield1.addActionListener(this);
		
		//Create TextFeild 2
		textfield2 =new JTextField("",16);
		panel1.add(textfield2);
		textfield2.setToolTipText("Enter the surname of the person");
		textfield2.addActionListener(this);
		

		//Create TextFeild 3
		textfield3 =new JTextField("",16);
		panel1.add(textfield3);
		textfield3.setToolTipText("Enter the city the person lives");
		textfield3.addActionListener(this);
		
		
		// Creating Button Number 1
		button1=new JButton("Save");
		panel1.add(button1);
		button1.setToolTipText("Save the details of the person you have entered");
		button1.addActionListener(this);

		
		// Creating Button Number 2
		button2=new JButton("Show All");
		panel1.add(button2);
		button2.setToolTipText("Show all the persons you have entered");
		button2.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
			
		}
		
	
}
    

