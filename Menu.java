/**
 * 
 * @author intern-1
 * 
 * <h1> This class accepts the MenuTitle and Displays the Menu along with the MenuItems in it.</h1>
 *	<p>This class Menu has independent Functionality i.e it dispalys any type of menu.</p>
 */



import java.util.*;


	public class Menu 
	{
	
			public String menuTitle;	//Variable to store Menu-Item
			public ArrayList<RestaurantMenuItem> menuitems=new ArrayList<RestaurantMenuItem>();		//List to store all the MenuItems. 
			
			
			 
			
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
					int i=1;	//Variable to print MenuItem Index.
				
				
					Scanner sc=new Scanner(System.in);
					String choice;	//Variable to accept the choice .	
					
					System.out.println("Do you want to display Menu-Items along with index-no   (Y/N)");
					choice=sc.nextLine();
					
						if(choice.equalsIgnoreCase("Y"))
						{
						System.out.println("-------------"+menuTitle+"---------------");
						
							for(RestaurantMenuItem eachItem : menuitems)		//Displays all the MenuItems in Menu with Index
							{
								System.out.print("\n"+ i + ": ");				//Display the index
								eachItem.displayMenuItem();						//Display the menu-item
								
								i++;					//Increment the Index			
								
							}
						}
						
							else if(choice.equalsIgnoreCase("N"))
							{
								System.out.println("-------------"+menuTitle+"---------------");
								
								for(RestaurantMenuItem eachItem : menuitems)		//Displays all the MenuItems in Menu without Index
								{
									
									eachItem.displayMenuItem();						//Display the menu-item
									System.out.println();
								}
						
							}
						
							else
							{
								System.out.println("Please enter a correct choice...");
							}
					
				
					}
				
			
			
		
}
