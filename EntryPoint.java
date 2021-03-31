import java.util.*;

public class EntryPoint {
	
	public static void main(String arg[])
	{
		
	//	AddressBookMenu abm=new AddressBookMenu();		//Create an instance of AddressBookMenu	 Class
		
	//	abm.initialize();								//Call the initialize method of AddressBookMenu	Class	
	// abm.display();
	
		
		
		InitializeRestaurantMenu irm=new InitializeRestaurantMenu();
		irm.initialize();	//Initialize the Restaurant Menu Title and Menu-Items.
		irm.Display();		//Display the Restaurant Menu.
	}

}
