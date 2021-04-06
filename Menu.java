
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
				public Map<Integer,MenuItem> menuitems=new HashMap<Integer,MenuItem>();		//List to store all the MenuItems. 
				
				 
				
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
					
						System.out.println("-------------"+menuTitle+"---------------\n");
						
						Iterator <Integer> itr = menuitems.keySet().iterator();       //keyset is a method which returns the keys stored in hashmap  
						
						while(itr.hasNext())  
						{  
						int key=(int)itr.next();  
						System.out.println(key+":    "+menuitems.get(key).menuItemTitle);  
						}
					}
					
					
					
					
					//This Method returns the menu option  from the user.
					int i=0;
					public int getMenuItemOption() 
					{
						
						
						Scanner sc=new Scanner(System.in);
						System.out.println("\nEnter your choice");
						int choice=sc.nextInt();
						
						
						MenuItem mi=menuitems.get(choice);
						i=(Integer)mi.getAction().execute();
						
						return i;
						
		/*				if(loop.equals("true"))
						{
							displayMenu();
							getMenuItemOption();
						}
		*/
						
					
					}
						
	


		}
