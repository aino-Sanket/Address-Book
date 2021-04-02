import java.util.ArrayList;

/**
 * 
 * @author intern-1
 *
 *<h1>MenuItem class gets and sets the different Menu-Items.</h1>
 *It is independent of any menu-items
 *i.e we can set and get any menu-items we want. 
 */




public class MenuItem 
{
	
		public String menuItemTitle;	//Stores the menu-items name
		public static int order=0;
		Action action;					//Reference of Action interface.
		
		
			public MenuItem(String menuItemTitle)
			{
				this.setMenuItemTitle(menuItemTitle);
				order++;
			}
			
			
			
			//set the Menu-Item name
			public void setMenuItemTitle(String menuItemTitle)	
			{
				this.menuItemTitle=menuItemTitle;
			}
			
			
			//returns the menu item.
			public String getMenuItemTitle()
			{
				return this.menuItemTitle;
			}
			
			//sets the action of MenuItem
			public void setAction(Action obj)
			{
				this.action=obj;
			}
			
			public Action getAction()
			{
				return this.action;
			}
			
			
			//Displays the current menu item.
			public void displayMenuItem()
			{
				
				System.out.print(this.menuItemTitle);
			}

}
