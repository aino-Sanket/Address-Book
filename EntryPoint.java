/**
 * 
 * @author intern-1
 * 
 * 
 * <h1> This is Entry Point Class </h1>
 * 
 *  In this class we create the type of menu to be created
 * 	  for eg: 1 Address-Book Menu
 * 			  2 Restaurant Menu
 * 
 * First we initialize and display the corresponding Menu.
 * 	
 * 		 
 */



import java.util.*;

public class EntryPoint {
	
	public static void main(String arg[])
	{
		
		InitializeAddressBookMenu iabm=new InitializeAddressBookMenu();		//Create an instance of AddressBookMenu	 Class
		
										
		iabm.initialize();					//Call the initialize method of AddressBookMenu	Class
		
		
		int i=0;
		do
		{
		iabm.displayMenu();
		
		i=iabm.getMenuItemOption();						//Get the menu item option from user.
		}while(i!=0);
		
		
	//	InitializeRestaurantMenu irm=new InitializeRestaurantMenu();
	//	irm.initialize();	//Initialize the Restaurant Menu Title and Menu-Items.
	//	irm.displayMenu();		//Display the Restaurant Menu.
	
	}
	
	

}
