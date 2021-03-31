import java.util.*;

/**
 * 
 * @author intern-1
 * 
 * This class accepts the MenuTitle and Displays the Menu along with the MenuItems in it.
 *
 */



	public class Menu 
	{
	
			public String menuTitle;
			public ArrayList<MenuItem> menuitems=new ArrayList<MenuItem>();		//List to store all the menuitems. 
			
			
			 
			
			//This method sets the Menu Title
			public void setMenuTitle(String menuTitle)
			{
				this.menuTitle=menuTitle;
				
			}
			
			
			// method returns the Menu Title
			public String getMenuTitle()
			{
				return this.menuTitle;
			}
			
			
			
			//Displays the entire  menu
			public void displayMenu()
			{
				int i=1;	//Variable to print MenuItem no.
				
				System.out.println("-------------"+menuTitle+"---------------");
				
					for(MenuItem eachItem : menuitems)		//Displays all the menuitems in menu
					{
						System.out.print(i+": ");
						eachItem.displayMenuItem();
						System.out.println();
						i++;
						
					}
				
			}
		
			
		
}
