/**
 * 
 * @author intern-1
 *
 *<h1>PersonAddressInfo class Stores the address-information of a person</h1>
 *
 *This class has 5 attributes to store a single persons address  such as his name
 *
 */
import java.util.*;

public class PersonAddressInfo {
	
	public String name;
	public String street;
	public String city;
	public String state;
	public String country;
	public int zipcode;
//	ArrayList<ActionCreate> addressEntries=new ArrayList<ActionCreate>();
	

	HashMap<Integer,ActionCreate> addressEntries=new HashMap<Integer,ActionCreate>();
}
