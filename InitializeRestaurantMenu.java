/**
 * @author intern-1
 * 
 * <h1>This class Creates the menu-Items of Restaurant.</h1> 
 * 		
 * <p>Restaurant Menu-Items are created and added to the ArrayList</p>
 * 
 * 
 */



import java.util.*;



public class InitializeRestaurantMenu extends Menu 
{
	
		public void initialize()
		{
			setMenuTitle("Restaurant Menu");		//Set the Restaurant Menu Title
	
			
			RestaurantMenuItem RestaurantMenuItem1=new RestaurantMenuItem("Tea",20);	//Assign Tea Menu-Item	
			menuitems.add(RestaurantMenuItem1);						//Menu-Item added to arraylist of Menu Class
			
			
			
			RestaurantMenuItem RestaurantMenuItem2=new RestaurantMenuItem("Coffee",35);	//Assign Coffee Menu-Item	
			menuitems.add(RestaurantMenuItem2);						//Menu-Item added to arraylist of Menu Class
			
			
			
			RestaurantMenuItem RestaurantMenuItem3=new RestaurantMenuItem("Toast Butter",50);	//Assign Toast-Butter Menu-Item
			menuitems.add(RestaurantMenuItem3);							//Menu-Item added to arraylist of Menu Class
			
		
		}

}
