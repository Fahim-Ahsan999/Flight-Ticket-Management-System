package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Account 
{
	private String password;
	private String accountHolderName;
	
	public Account()
	{

	}
	public Account(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
	public String getPassword(){return password;}
	public String getAccountHolderName(){return accountHolderName;}
	
	
}