/**
 *<h1> This class finds wether the record is present in the Address-Book or not. </h1>
 *
 */


import java.util.*;


public class ActionFind extends PersonAddressInfo  implements Action{

	Scanner sc=new Scanner(System.in);

	public Object execute()			//overridden execute method of Action Interface 
	{
		boolean flag=false;			//Flag variable used to find wether the element is found or not
		
		System.out.println("Enter the name whose details are to be found");
		String name=sc.nextLine();		//Accept the name of the person whose details are to be found
		
		
		for(Map.Entry<Integer,ActionCreate> entry : addressEntries.entrySet())		//Iterate through each element in  Address-Book.
		{
			
			if(name.equals(entry.getValue().name))				//Check if the entry is present in the address-book.
			{
				System.out.println("Record is present in the AddressBook\n");
				flag=true;				//Set the flag if element is Found.
				return (Integer)entry.getKey();
			}
		}
		
		if(flag==false)
		{
			System.out.println("Record not present in the AddressBook.....\n");		//Display this message if element is not present. 
			return Integer.valueOf(-1);
		}
		
		return Integer.valueOf(1);
	}
}
