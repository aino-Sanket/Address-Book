/**
 *  <h1> This class Displays all the records in Address-Book</h1>
 * 
 */

import java.util.*;

public class ActionDisplay extends ActionCreate  implements Action{

	public Object execute()		//overridden execute method of Action Interface
	{
		
		boolean flag=false;
		
		 for(Map.Entry<Integer,ActionCreate> eachAddress : addressEntries.entrySet())	//Display all the records from the address-book
			{
				
		
					
			 	System.out.println("\nName is: " + eachAddress.getValue().name);
				
				System.out.println("Street name  is: " + eachAddress.getValue().street);
				
				System.out.println("City name is: " + eachAddress.getValue().city);
				
				System.out.println("State name is : " + eachAddress.getValue().state);
				
				System.out.println("Country name is: " + eachAddress.getValue().country);
				
				System.out.println("Zipcode  is: " + eachAddress.getValue().zipcode + "\n");
				
				flag=true;
		 
			}
		 
		 	if(flag==false)
		 	{
		 		System.out.println("No Elements yet in Address-Book to be displayed \n");
		 	}
		 	
		
		
		
		 return Integer.valueOf(1);
	}

}
