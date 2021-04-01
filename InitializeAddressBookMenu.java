/** 
 * 
 * @author intern-1
 *
 *	AddressBookMenu Class Displays the Menu title and accepts
 *	the different menu-items and calls the display method of Menu Class.
 */


public class InitializeAddressBookMenu extends Menu
{
	
	
		public void initialize()
		{
			
								//Create the menu instance
			setMenuTitle("Address Book Menu");		//Set the menu of the Address-Book
			
			
			MenuItem menuitem1=new MenuItem("Create");	//Assign Create Menu-Item	
			menuitems.add(menuitem1);
			
			
			MenuItem menuitem2=new MenuItem("Display");		//Assign Display Menu-Item	
			menuitems.add(menuitem2);
			
			
			MenuItem menuitem3=new MenuItem("Delete");		//Assign Delete Menu-Item
			menuitems.add(menuitem3);
			
			
			MenuItem menuitem4=new MenuItem("Find");		//Assign Find Menu-Item		
			menuitems.add(menuitem4);
			
			
			MenuItem menuitem5=new MenuItem("Update");			//Assign Update Menu-Item		
			menuitems.add(menuitem5);
			
			
			MenuItem menuitem6=new MenuItem("Exit");			//Assign Exit Menu-Item.
			menuitems.add(menuitem6);
			
			
			displayMenu();									//Displays the Menu with the Menu-Items.
			
		}

}
