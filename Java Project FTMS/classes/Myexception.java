package classes;
//import classes.*;
import interfaces.*;
//import Login.*;
import java.lang.*;
public class Myexception extends Exception
{
public String getMsg()
{
	return "The password is less than 8 character";
}

}