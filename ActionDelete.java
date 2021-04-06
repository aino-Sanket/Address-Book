/**
 * 
 * @author Sanket Kolhe
 *
 *<h1> This Class Deletes a specific Record Present in the Address-Book </h1>
 *
 */


public class ActionDelete extends PersonAddressInfo  implements Action{
	

	public Object execute()				//Overridden execute method of Action Interface
	{
		
		
		ActionFind af=new ActionFind();			//Create an instance of ActionFind Class to check wether record is present or not in the Address-Book
		int key=(Integer)af.execute();			//Call the execute method of the ActionFind Class which returns the key of record if found
		
		if(key!=-1)
		{
			addressEntries.remove(key);		//Delete required record to be deleted from Address-Book.	
			
			System.out.println("Record Deleted SuccessFully......\n");
			
		}
		
		
		return Integer.valueOf(1);
	}
}
