package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OFrame extends JFrame implements MouseListener, ActionListener 
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel imgLabel = new JLabel();
	ImageIcon img = new ImageIcon();
	JLabel success = new JLabel();
	Login l ;
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton exit = new JButton();
	SFrame sf;
	Emergency w;
	Cancel re;
	

	public OFrame(String s1,String s2,String s3,SFrame sf)
	{
		super(" Please chose your option ");
		this.setSize(420,568);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.sf = sf;
		this.add(panel);

	    panel.setLayout(null);
	    

	    button = new JButton("BUY TICKET");
	    button.setBounds(130,340,165,25);
	    button.addMouseListener(this);
	    button.addActionListener(this);
	    panel.add(button);

	    button1 = new JButton("EMERGENCY TICKET");
	    button1.setBounds(130,380,165,25);
	    button1.addMouseListener(this);
	    button1.addActionListener(this);
	    panel.add(button1);

	   

	    exit = new JButton("BACK");
	    exit.setBounds(130,420,165,25);
	    exit.addMouseListener(this);
	    exit.addActionListener(this);
	    panel.add(exit);

	    this.add(panel);

	    img = new ImageIcon("0.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0, 0, 420, 568);
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
		else if(me.getSource() == button1)
		{
			button1.setBackground(Color.GREEN);
			button1.setForeground(Color.WHITE);
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
		else if(me.getSource() == button1)
		{
			button1.setBackground(Color.YELLOW);
			button1.setForeground(Color.BLACK);
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

		if(exit.getText().equals(command))
		{
			String user ="";
	    	String password = "";
			SFrame sf = new SFrame(user,password,l);

			sf.setVisible(true);
			this.setVisible(false);
		}
		else if(button.getText().equals(command))
		{
			String s1 = "";
			
			Cancel re = new Cancel(s1, this);
			re.setVisible(true);
			this.setVisible(false);
		}
		else if(button1.getText().equals(command))
		{
			String s1 = "";
			
			Emergency w = new Emergency (s1, this);
			w.setVisible(true);
			this.setVisible(false);
		}

		else{}

	}

}

