/**
 * 
 * @author Sanket Kolhe
 * 
 * <h1>This Class updates a specific record in the Address-Book </h1>
 *
 */

import java.util.*;

public class ActionUpdate extends PersonAddressInfo  implements Action{

	Scanner sc=new Scanner(System.in);
	
	public Object execute()		//Overridden execute method of Action Interface
	{
		//System.out.println("Enter the name of the person whose record is to be Updated");
	//	String name=sc.nextLine();
		
		ActionFind af=new ActionFind();			//Create an instance of ActionFind Class to check wether record is present or not in the Address-Book
		int key=(Integer)af.execute();			//Call the execute method of the ActionFind Class
		
		if(key!=-1)						//Check if Record is present 
		{
			
			ActionCreate  updateCreate=addressEntries.get(key);		//Get required record to be updates from Address-Book
			
			System.out.println("Enter the new Street name  ");		
			updateCreate.street=sc.nextLine();						//Get the new Street name
			
			System.out.println("Enter the new City name  ");
			updateCreate.city=sc.nextLine();						//Get the new City name
			
			System.out.println("Enter the new State  ");
			updateCreate.state=sc.nextLine();						//Get the new State name
			
			System.out.println("Enter the new Country Name  ");
			updateCreate.country=sc.nextLine();						//Get the new Country name		
			
			System.out.println("Enter the new zipcode");
			updateCreate.zipcode=sc.nextInt();						//Get the new zip-code
			
			sc.nextLine();		//Flush the scanner buffer.
			
			System.out.println("Record Updated Successfully.........   \n");
			
		}
		
		return Integer.valueOf(1);
	}
}
