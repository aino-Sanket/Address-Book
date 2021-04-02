import java.util.*;

public class ActionDisplay extends ActionCreate  implements Action{

	public Object execute()
	{
		
	/*	for(PersonAddressInfo eachAddress: addressEntries)
		{
			System.out.println("Name is: " + eachAddress.name);
			
			System.out.println("Street name  is: " + eachAddress.street);
			
			System.out.println("City name is: " + eachAddress.city);
			
			System.out.println("State name is : " + eachAddress.state);
			
			System.out.println("Country name is: " + eachAddress.country);
			
			System.out.println("Zipcode  is: " + eachAddress.zipcode);
			
			
		}
		*/
		
		 Iterator hmIterator = addressEntries.entrySet().iterator();
		 while (hmIterator.hasNext()) {
	            Map.Entry mapElement = (Map.Entry)hmIterator.next();
	            ActionCreate eachAddress=(ActionCreate)mapElement.getValue();
				
	            System.out.println("Name is: " + eachAddress.name);
				
				System.out.println("Street name  is: " + eachAddress.street);
				
				System.out.println("City name is: " + eachAddress.city);
				
				System.out.println("State name is : " + eachAddress.state);
				
				System.out.println("Country name is: " + eachAddress.country);
				
				System.out.println("Zipcode  is: " + eachAddress.zipcode);
				
		 }
		System.out.println("Inside Display");
		
		
		
		return Integer.valueOf(1);
	}

}
