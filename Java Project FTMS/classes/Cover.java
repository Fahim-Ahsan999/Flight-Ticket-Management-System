package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cover extends JFrame implements MouseListener, ActionListener 
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel imgLabel = new JLabel();
	ImageIcon img = new ImageIcon();
	//JLabel userLabel = new JLabel();
	Login l ;
	JButton button = new JButton();
	Color myColor;
	JLabel userLabel1 ,userLabel2;
	Font myFont;
	JButton exit = new JButton();
	Customer c ;
	Admin t ;

	public Cover()
	{
		super(" AIRPLANE TICKET APP ");
		this.setSize(1000,667);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.l = l;
		this.add(panel);

	    panel.setLayout(null);

	   /* userLabel = new JLabel("* welcome to our AIR TICKET APP ");
	    userLabel.setBounds(40,70,380,25);
	    userLabel1 = new JLabel("* HAVE A SAFE JOURNEY ");
	    userLabel1.setBounds(40,110,450,25);
	    userLabel2 = new JLabel("    THANKS FOR YOU TRUST");
	    userLabel2.setBounds(40,150,450,25); */
	    myColor = new Color(210, 230, 135);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		
		
		panel.setBackground(myColor);
	   
		/*
		userLabel.setBackground(Color.PINK);
		userLabel.setOpaque(true);
		userLabel.setForeground(Color.BLUE);
		userLabel.setFont(myFont);
		panel.add(userLabel);

		userLabel1.setBackground(Color.PINK);
		userLabel1.setOpaque(true);
		userLabel1.setForeground(Color.BLUE);
		userLabel1.setFont(myFont);
		panel.add(userLabel1);

		userLabel2.setBackground(Color.PINK);
		userLabel2.setOpaque(true);
		userLabel2.setForeground(Color.BLUE);
		userLabel2.setFont(myFont);
		panel.add(userLabel2); */


	    button = new JButton(" ENTER ");
	    button.setBounds(430,460,125,55);
	    button.addMouseListener(this);
	    button.addActionListener(this);
	    panel.add(button);

	    exit = new JButton("EXIT");
	    exit.setBounds(430,520,125,55);
	    exit.addMouseListener(this);
	    exit.addActionListener(this);
	    panel.add(exit);

	    this.add(panel);

	    img = new ImageIcon("bg-2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 1000, 667);
		panel.add(imgLabel);

		this.add(panel);

	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == button)
		{
			button.setBackground(Color.GREEN);
			button.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == exit)
		{
			exit.setBackground(Color.RED);
			exit.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	} 
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == button)
		{
			button.setBackground(Color.YELLOW);
			button.setForeground(Color.BLACK);
		}
		
		else if(me.getSource() == exit)
		{
			exit.setBackground(Color.MAGENTA);
			exit.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	} 

	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();

		if(button.getText().equals(command))
		{
			String s = "";
			
			Login l = new Login(s,this);
			l.setVisible(true);
			this.setVisible(false);
		}
		
		else if(exit.getText().equals(command))
		{
			System.exit(0);
		}
		else{}

	}

}
