package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SFrame extends JFrame implements MouseListener, ActionListener
{
	JLabel label;
	JButton btnOne, btnTwo, btn;
	JPanel panel = new JPanel();
	Login l;
	ImageIcon img1 = new ImageIcon();
	JLabel imgLabel1 = new JLabel();
	Color myColor;
	JLabel success = new JLabel();
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JComboBox combo;
	Cover co;


	public SFrame(String user,String password,Login l)
	{
		super("Information Page");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myColor = new Color(186, 85, 211);
		this.l = l;
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
		
		label = new JLabel("Info: "+user);
		label.setBounds(100,150,150,30);
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		panel.add(label);
		

		this.add(panel);
		
		btnOne = new JButton("Back");
		btnOne.setBounds(250, 250,80, 30);
		btnOne.addActionListener(this);
		panel.add(btnOne);
		
		btnTwo = new JButton("Next");
		btnTwo.setBounds(350, 250,80, 30);
		btnTwo.addActionListener(this);
		panel.add(btnTwo);
		
		btn = new JButton("Log Out");
		btn.setBounds(450, 250,80, 30);
		btn.addActionListener(this);
		panel.add(btn);

		r1 = new JRadioButton("Morning");
		r1.setBounds(450, 50, 100, 20);
		//r1.setBackground(Color.ORANGE);
		panel.add(r1);
		
		r2 = new JRadioButton("Evening");
		r2.setBounds(450, 80, 100, 20);
		//r2.setOpaque(false);
		panel.add(r2);
		
		r3 = new JRadioButton("Night");
		r3.setBounds(450, 110, 100, 20);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		
		c1 = new JCheckBox("US BD");
		c1.setBounds(570, 50, 100, 20);
		panel.add(c1);
		
		c2 = new JCheckBox("NOVO AIR");
		c2.setBounds(570, 80, 100, 20);
		panel.add(c2);
		
		c3 = new JCheckBox("BD AIR");
		c3.setBounds(570, 110, 100, 20);
		panel.add(c3);
		
		
		String items[] = {"BUSINESS", "ECONOMY", "FIRSTCLASS", "SECONDCLASS", "EMERGENCY"};
		combo = new JComboBox(items);
		combo.setBounds(100, 50, 100, 30);
		panel.add(combo);

		success = new JLabel("");
		success.setBounds(150,260,80,30);
		panel.add(success);
		
		this.add(panel);
		
		
	}

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == btnOne)
		{
			btnOne.setBackground(Color.GREEN);
			btnOne.setForeground(Color.WHITE);
		}
		else if(me.getSource() == btnTwo)
		{
			btnTwo.setBackground(Color.RED);
			btnTwo.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == btnOne)
		{
			btnOne.setBackground(Color.YELLOW);
			btnOne.setForeground(Color.BLACK);
		}
		else if(me.getSource() == btnTwo)
		{
			btnTwo.setBackground(Color.MAGENTA);
			btnTwo.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		String s1="",s2="";
		if(r1.isSelected())
			{
				s1 = r1.getText();
			}
			else if(r2.isSelected())
			{
				s1 = r2.getText();
			}
			else if(r3.isSelected())
			{
				s1 = r3.getText();
			}
			else
			{
				
			}
				
			if(c1.isSelected())
			{
				s2 = c1.getText();
			}
			else if(c2.isSelected())
			{
				s2 = c2.getText();
			}
			else if(c3.isSelected())
			{
				s2 = c3.getText();
			}
			else
			{
				
			}

		if(btnOne.getText().equals(command))
		{
			String s = "";
			
			Login l = new Login(s,co);
			l.setVisible(true);
			this.setVisible(false);
		}
		else if(btnTwo.getText().equals(command))
		{
			
			String s3 = combo.getSelectedItem().toString();
			
			OFrame o = new OFrame(s1,s2,s3,this);
			o.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(btn.getText().equals(command))
		{
			String s = "";
			
			Login l = new Login(s,co);
			l.setVisible(true);
			this.setVisible(false);
		}
		
		else
		{
			
		}
	}

}
