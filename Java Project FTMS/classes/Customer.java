package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import interfaces.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Customer extends JFrame implements ActionListener, MouseListener
{
	JButton insert, exit;
	JTextField insertTF, passTF;
	JLabel insertiontext, insertionpass;
	JPanel panel;
	JLabel imgLabel = new JLabel();
	ImageIcon img = new ImageIcon();
	Color myColor;
	Font myFont;
	Account accounts[];
	Account acc;
	NewFrame nf ;
	Login l;
	
	public Customer(String s1, NewFrame nf)
	{
		super("Create Customer Account");
		this.setSize(680, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.nf = nf;
		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 28);

		accounts = new Account[15];

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		insertiontext = new JLabel("Enter Name");
		insertiontext.setBounds(150, 115, 160, 30);
		panel.add(insertiontext);

		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		
		
		panel.setBackground(myColor);
	   
		
		insertiontext.setBackground(Color.CYAN);
		insertiontext.setOpaque(true);
		insertiontext.setForeground(Color.BLACK);
		insertiontext.setFont(myFont);
		panel.add(insertiontext);

		insertTF = new JTextField("");
		insertTF.setBounds(150, 160, 160, 30);
		panel.add(insertTF);

		

		insertionpass = new JLabel("Set Password");
		insertionpass.setBounds(350, 115, 160, 30);
		panel.add(insertionpass);

		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		
		
		panel.setBackground(myColor);
	   
		
		insertionpass.setBackground(Color.CYAN);
		insertionpass.setOpaque(true);
		insertionpass.setForeground(Color.BLACK);
		insertionpass.setFont(myFont);
		panel.add(insertionpass);

		passTF = new JTextField("");
		passTF.setBounds(350, 160, 160, 30);
		panel.add(passTF);

		insert = new JButton("Create Account");
		insert.setBounds(250, 210, 170, 30);
		
		insert.addMouseListener(this);
		panel.add(insert);

		exit = new JButton("EXIT");
	    exit.setBounds(250,245,170,30);
	    exit.addMouseListener(this);
	    
	    panel.add(exit);

		
		insert.addActionListener(this);
		exit.addActionListener(this);
		
		this.add(panel);

		img = new ImageIcon("image2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 680,450);
		panel.add(imgLabel);

		this.add(panel);
	}
	
	
	public void insertAccount(String a)
	{
		int flag = 0;
		acc = new Account(a);
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				flag = 1;
				break;
			}
		}
		if(flag == 1){showMessageDialog(null, "Congratulation!!! Account Creation Successful!");}
		else {showMessageDialog(null, "Unsuccesful operation!");}
	}

	public void insertPass(String b)
	{
		int flag = 0;
		acc = new Account(b);
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc;
				flag = 1;
				break;
			}
		}
		
	}
	
	

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == insert)
		{
			insert.setBackground(Color.BLUE);
			insert.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exit)
		{
			exit.setBackground(Color.RED);
			exit.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == insert)
		{
			insert.setBackground(Color.GREEN);
			insert.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exit)
		{
			exit.setBackground(Color.MAGENTA);
			exit.setForeground(Color.BLACK);
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		String user = insertTF.getText();
		String password = passTF.getText();
		
		if(ae.getSource() == insert)
		
		{
			insertAccount(user);   // insert method call
		    insertPass(password);

		    SFrame sf = new SFrame(user,password,l);
			sf.setVisible(true);
			this.setVisible(false);
		    
		}
		else if(exit.getText().equals(command))
		{
			
			nf.setVisible(true);
			this.setVisible(false);
		}
		
		else
		{

		}

		}	
}