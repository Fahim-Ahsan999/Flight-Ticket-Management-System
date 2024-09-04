package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Tickets
{
	
	private String ticketName;
	
	
	public Tickets()
	{

	}
	public Tickets(String ticketName)
	{
		this.ticketName = ticketName;
	}
	
	public void setTicketName(String ticketName)
	{
		this.ticketName = ticketName;
	}
	
	public String getTicketName()
	{
		return ticketName;
	}
	
	
}