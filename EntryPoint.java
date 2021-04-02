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
		
										//Call the initialize method of AddressBookMenu	Class	
	
		iabm.initialize();
		
		int flag=0;
		do
		{
			iabm.displayMenu();
		
			flag=iabm.getMenuItemOption();						//Get the menu item option from user.
		}while(flag!=0);
		
		
	//	InitializeRestaurantMenu irm=new InitializeRestaurantMenu();
	//	irm.initialize();	//Initialize the Restaurant Menu Title and Menu-Items.
	//	irm.displayMenu();		//Display the Restaurant Menu.
	
	}
	
	

}
