package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import exception.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Login extends JFrame implements MouseListener, ActionListener 
{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel userLabel = new JLabel();
	JTextField userText = new JTextField();
	JLabel passwordLabel= new JLabel();
	JPasswordField passwordText = new JPasswordField();
	JLabel success = new JLabel();
	JLabel imgLabel = new JLabel();
	JButton button = new JButton();
	JButton exit = new JButton();
	JButton nA = new JButton();
	ImageIcon img = new ImageIcon();
	Cover co;
	

	public Login(String s,Cover co)
	{
		super(" Log in ");
		this.setSize(800,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.add(panel);


	    panel.setLayout(null);
	    userLabel = new JLabel("User Name : ");
	    userLabel.setBounds(200,115,110,30);
	    panel.add(userLabel);

	    userText.setBounds(280,115,100,30);
	    panel.add(userText);

	    passwordLabel = new JLabel("Password : ");
	    passwordLabel.setBounds(200,165,100,30);
	    panel.add(passwordLabel);

	    passwordText.setBounds(280,165,100,30);
	    panel.add(passwordText);

	    button = new JButton("Log in");
	    button.setBounds(180,225,80,30);
	    button.addMouseListener(this);
	    button.addActionListener(this);
	    panel.add(button);

	    exit = new JButton("EXIT");
	    exit.setBounds(300,225,80,30);
	    exit.addMouseListener(this);
	    exit.addActionListener(this);
	    panel.add(exit);

	    nA = new JButton("Create New Account");
	    nA.setBounds(200,285,165,25);
	    nA.addMouseListener(this);
	    nA.addActionListener(this);
	    panel.add(nA);

	    success = new JLabel(" ");
	    success.setBounds(110,395,300,25);
	    panel.add(success);

	    img = new ImageIcon("images.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(450,115,200, 112);
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

	    	String user = userText.getText();
	    	String password = passwordText.getText();
	    
	    	try{
				if(password.length()<8)
				{
					
					throw new Myexception();
				}
			}
			catch(Myexception m)
			{
				showMessageDialog(null,m.getMsg());
			}
	    
	    	if(user.equals("admin")&&password.equals("12345678")&&password.length()>=8)
	   	 	{
	    
	    	success.setText("successful Login");
			showMessageDialog(null, "         Login Succesful");
	   	 	SFrame sf = new SFrame(user,password,this);
			sf.setVisible(true);
			this.setVisible(false);
			
			
			}
			else
			{
				showMessageDialog(null, "Invalid Username or password!");
			}
			

		}
		else if(nA.getText().equals(command))
		{
			String s = "";
			NewFrame nf = new NewFrame(s,this);
			nf.setVisible(true);
			this.setVisible(false);
		}

		else if(exit.getText().equals(command))
		{
			Cover co = new Cover();
			co.setVisible(true);
			this.setVisible(false);
		}
		else{}

	}

}
