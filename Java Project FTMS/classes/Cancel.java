package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import interfaces.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Cancel extends JFrame implements ActionListener, MouseListener
{
	JButton search, add, re;
	JTextField searchTF, returnTF, addTF;
	JLabel searchtext, returntext, addtext, info;
	JPanel panel = new JPanel();
	JLabel imgLabel = new JLabel();
	ImageIcon img = new ImageIcon();
	JButton btnOne, button,payBtn;
	JButton btn = new JButton();
	Color myColor;
	Font myFont;
	
	Tickets bk[];
	Tickets b;
	Cover co;
	OFrame o;
	SFrame s;
	
	public Cancel(String s1,OFrame o)
	{
		super("BUY TICKET");
		this.setSize(900,531);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		bk = new Tickets[15];

		panel = new JPanel();
		panel.setLayout(null);
		
		searchtext = new JLabel("   PURCHASE ");
		searchtext.setBounds(250, 175, 160, 30);
		panel.add(searchtext);

		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		
		
		panel.setBackground(myColor);
	   
		
		searchtext.setBackground(Color.WHITE);
		searchtext.setOpaque(true);
		searchtext.setForeground(Color.BLACK);
		searchtext.setFont(myFont);
		panel.add(searchtext);

		addTF = new JTextField("");
		addTF.setBounds(250, 225, 160, 30);
		panel.add(addTF);

		add = new JButton("Add");
		add.setBounds(250, 265, 160, 30);
		panel.add(add);

		searchTF = new JTextField("");
		searchTF.setBounds(50, 75, 300, 30);
		panel.add(searchTF);

		search = new JButton("Search");
		search.setBounds(370, 75, 110, 30);
		panel.add(search);

		returntext = new JLabel("       CANCEL");
		returntext.setBounds(500, 175, 160, 30);
		panel.add(returntext);

		myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		
		
		panel.setBackground(myColor);
	   
		
		returntext.setBackground(Color.WHITE);
		returntext.setOpaque(true);
		returntext.setForeground(Color.BLACK);
		returntext.setFont(myFont);
		panel.add(returntext);

		returnTF = new JTextField("");
		returnTF.setBounds(500, 225, 160, 30);
		panel.add(returnTF);

		re = new JButton("Cancel");
		re.setBounds(500, 265, 160, 30);
		panel.add(re);

		btnOne = new JButton("Back");
		btnOne.setBounds(290, 330,80, 30);
		btnOne.addMouseListener(this);
		btnOne.addActionListener(this);
		panel.add(btnOne);

		btn = new JButton("Log Out");
		btn.setBounds(550, 330,80, 30);
		btn.addMouseListener(this);
		btn.addActionListener(this);
		panel.add(btn);

		button = new JButton("CONFIRMED TICKET");
	    button.setBounds(595,90,165,25);
	    button.addMouseListener(this);
	    button.addActionListener(this);
	    panel.add(button);

	    payBtn = new JButton("PAY");
		payBtn.setBounds(420, 400,80, 30);
		payBtn.addActionListener(this);
		panel.add(payBtn);

		
		add.addActionListener(this);
		re.addActionListener(this);
		search.addActionListener(this);
		this.add(panel);

		img = new ImageIcon("air.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 900, 531);
		panel.add(imgLabel);

		this.add(panel);
	}
	
	
	
	public void addTicket(String a)
	{
		int flag = 0;
		b = new Tickets(a);
		for(int i=0; i<bk.length; i++)
		{
			if(bk[i] == null)
			{
				bk[i] = b;
				flag = 1;
				break;
			}
		}
		if(flag == 1){showMessageDialog(null, "Congratullation!! The Ticket is Added");}
		else {showMessageDialog(null, "Access Denied. Please Try Again...");}
	}

	public void searchTicket(String a)
	{
		int flag = 0;
		try
		{
			for(int i=0; i<bk.length; i++)
			{
			if(bk[i].getTicketName().equals(a))
			{
				bk[i] = b;
				flag = 1;
				break;
			}
			}
		}
		catch(NullPointerException npe)
		{
			//JOptionPane.showMessageDialog(null,"NullPointerException");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1){JOptionPane.showMessageDialog(null, "Congratullation !! Ticket found!!!");}
		else {JOptionPane.showMessageDialog(null, " SORRY !!!  Ticket Not Found!!!");}
	}
	
	public void cancelTicket(String a)
	{
		int flag = 0;
		try
		{
			for(int i=0; i<bk.length; i++)
		{
			if(bk[i].getTicketName().equals(a))
			{
				bk[i] = null;
				flag = 1;
				break;
			}
		}
		}
		catch(NullPointerException npe)
		{
			//JOptionPane.showMessageDialog(null,"NullPointerException");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1){JOptionPane.showMessageDialog(null, "Congratullation !! You Have Successfully Cancelled the Ticket...");}
		else {JOptionPane.showMessageDialog(null, "Invalid Access!!!Please Cancel The Right Ticket...");}
	}

	

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == search)
		{
			search.setBackground(Color.BLUE);
			search.setForeground(Color.WHITE);
		}
		else if(me.getSource() == add)
		{
			add.setBackground(Color.BLUE);
			add.setForeground(Color.WHITE);
		}
		else if(me.getSource() == btnOne)
		{
			btnOne.setBackground(Color.GREEN);
			btnOne.setForeground(Color.WHITE);
		}
		else if(me.getSource() == btn)
		{
			btn.setBackground(Color.RED);
			btn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == button)
		{
			button.setBackground(Color.GREEN);
			button.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == search)
		{
			search.setBackground(Color.GREEN);
			search.setForeground(Color.BLACK);
		}
		else if(me.getSource() == add)
		{
			add.setBackground(Color.GREEN);
			add.setForeground(Color.BLACK);
		}
		else if(me.getSource() == btnOne)
		{
			btnOne.setBackground(Color.YELLOW);
			btnOne.setForeground(Color.BLACK);
		}
		else if(me.getSource() == button)
		{
			button.setBackground(Color.YELLOW);
			button.setForeground(Color.BLACK);
		}
		else if(me.getSource() == btn)
		{
			btn.setBackground(Color.MAGENTA);
			btn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}

	//@Override
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		String s1 = addTF.getText();
		String s2 = returnTF.getText();
		String s3 =searchTF.getText();

		if(ae.getSource() == add)
		{
			addTicket(s1);   // insert method call
		    
		}
		else if(ae.getSource() == search)
		{
			searchTicket(s3);   // insert method call
		    
		}
		else if(ae.getSource() == re)
			{
				
				cancelTicket(s2);
				
			}
		else if(btnOne.getText().equals(command))
		{
			
			
			OFrame o = new OFrame(s1,s2,s3,s);
			o.setVisible(true);
			this.setVisible(false);
		}
		else if(button.getText().equals(command))
		{
			for(int i=0; i<bk.length; i++)
		    {
			if(bk[i] != null)
			{
				JOptionPane.showMessageDialog(null,i+".Added Ticket Name : "+bk[i].getTicketName());
				
			}
			}
		}
		else if(btn.getText().equals(command))
		{
			String s = "";
			
			Login l = new Login(s,co);
			l.setVisible(true);
			this.setVisible(false);

		}

		if(payBtn.getText().equals(command))

		{
				showMessageDialog(null, "payment successfull");
         }
		else
		{

		}

	}	
}