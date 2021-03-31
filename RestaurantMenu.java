import java.util.*;

public class RestaurantMenu
{
	public String title;
	public HashMap<String,Integer> menuitems=new HashMap<String,Integer> ();
	
	
	
	public void setRestaurantTitle(String title)	//Set the RestaurantMenu Title.
	{
		this.title=title;
	}
	
	
	
	public String getRestaurantTitle()		//Returns the RestaurantMenu Title.
	{
		return this.title;
	}
	
	
	public void Display()			//Display the Restaurant Menu
	{
		System.out.println("----------------"+title+"--------------------");
		
		for(Map.Entry menuitem:menuitems.entrySet())
		{    
	           System.out.println(menuitem.getKey()+"   Rs: "+menuitem.getValue());    
	         
		}  
		
	}
	

}
