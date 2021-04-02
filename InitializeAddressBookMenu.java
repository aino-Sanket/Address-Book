/** 
 * 
 * @author intern-1
 *
 *	AddressBookMenu Class Displays the Menu title and accepts
 *	the different menu-items.
 */


public class InitializeAddressBookMenu extends Menu
{
		 int key=1; 
	
		public void initialize()
		{
			
								//Create the menu instance
			setMenuTitle("Address Book Menu");		//Set the menu of the Address-Book
			
			
			MenuItem menuitem1=new MenuItem("Create");			//Assign Create Menu-Item	
			menuitems.put(key++,menuitem1);
			menuitem1.setAction(new ActionCreate());			//Set the Create Action
			
			
			MenuItem menuitem2=new MenuItem("Display");			//Assign Display Menu-Item	
			menuitems.put(key++,menuitem2);
			menuitem2.setAction(new ActionDisplay());			//Set the Display Action
			
			
			MenuItem menuitem3=new MenuItem("Delete");			//Assign Delete Menu-Item
			menuitems.put(key++,menuitem3);
			menuitem3.setAction(new ActionDelete());			//Set the Delete Action
			
			
			MenuItem menuitem4=new MenuItem("Find");			//Assign Find Menu-Item		
			menuitems.put(key++,menuitem4);
			menuitem4.setAction(new ActionFind());			//Set the Find Action
			
			
			MenuItem menuitem5=new MenuItem("Update");			//Assign Update Menu-Item		
			menuitems.put(key++,menuitem5);					
			menuitem5.setAction(new ActionUpdate());			//Set the Update Action
			
			
			MenuItem menuitem6=new MenuItem("Exit");			//Assign Exit Menu-Item.
			menuitems.put(key++,menuitem6);
			menuitem6.setAction(new ActionExit());			//Set the Exit Action
		
		
			
		}

}
