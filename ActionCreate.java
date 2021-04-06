/**
 * 
 * @author intern-1
 *
 *<h1>This Class is used to create the new address for a person</h1>
 *
 *This class accepts the required parameters to create the Address and creates the address for the person
 *and stores it into a hashmap one at a time.
 */


import java.util.*;

public class ActionCreate  extends PersonAddressInfo   implements Action
{
	Scanner sc=new Scanner(System.in);
	static int i=1;
	
	public Object execute()		//Overridden execute method of the Action Interface
	{  
		
	
		ActionCreate createObj=new ActionCreate();	//this object accepts the address info
		
		
		System.out.println("Enter the name	");
		createObj.name=sc.nextLine();				//accept  name
		
		
		System.out.println("Enter the street	");
		createObj.street=sc.nextLine();				//accept street
		
		
		System.out.println("Enter the city	");
		createObj.city=sc.nextLine();				//accept city
		
		
		System.out.println("Enter the state	");
		createObj.state=sc.nextLine();				//accept state
		
		System.out.println("Enter the country	");
		createObj.country=sc.nextLine();			//accept country

		
		System.out.println("Enter the zipcode	");
		createObj.zipcode=sc.nextInt();				//accept zipcode
		
		sc.nextLine();               //This line flushes the Scanner before the next Input from the user
	
		
		
		addressEntries.put(i++,createObj);		//Adds one persons address to the arraylist at a time.
		
		System.out.println(" Address Created SuccessFully.... \n");
		
		return Integer.valueOf(1);
		
		
	}
}
