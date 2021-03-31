import java.util.*;

public class InitializeRestaurantMenu extends RestaurantMenu 
{
	
	public void initialize()
	{
		this.setRestaurantTitle("Restaurant Menu");		//Set the Restaurant Menu Title

		
		RestaurantMenuItem RestaurantMenuItem1=new RestaurantMenuItem("Tea",20);	//Assign Tea Menu-Item	
		menuitems.put(RestaurantMenuItem1.menuItemTitle,RestaurantMenuItem1.price);
		
		
		
		RestaurantMenuItem RestaurantMenuItem2=new RestaurantMenuItem("Coffee",35);		//Assign Coffee Menu-Item	
		menuitems.put(RestaurantMenuItem2.menuItemTitle,RestaurantMenuItem2.price);
		
		
		
		RestaurantMenuItem RestaurantMenuItem3=new RestaurantMenuItem("Toast Butter",50);		//Assign Toast-Butter Menu-Item
		menuitems.put(RestaurantMenuItem3.menuItemTitle,RestaurantMenuItem3.price);
		
		
	}

}
