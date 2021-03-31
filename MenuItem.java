/**
 * 
 * @author intern-1
 *
 *MenuItem class gets and sets the different Menu-Items.
 */


public class MenuItem 
{
	
	public String menuItemTitle;	//Stores the menu-items name
	
	
	public MenuItem(String menuItemTitle)
	{
		this.setMenuItemTitle(menuItemTitle);
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
	
	
	//Displays the current menu item.
	public void displayMenuItem()
	{
		System.out.print(this.menuItemTitle);
	}

}
