/**
 * This class provides an AddressBook facility which helps to manage and store information of people and their addresses.
 * It provides features as mentioned below.
 * 1. Add details of a person.
 * 2. Display  information of all persons.
 * 3. Display details of a specific  person.
 * 4. Delete details of a specific person.
 * 5. Update details of a person. 
 */ 



import java.util.Scanner;


public class AddressDemo1
{
	
		public String name;
		public String street;
		public String city;
		public String country;
		public int zipcode;
	
	
		
		
		 //This is a Default Constructor which initializes the class characteristics to its default value 
		public AddressDemo1()
		{
			this.name=null;
			this.street=null;
			this.city=null;
			this.country=null;
			this.zipcode=0;
		}
		
	
		
		
		
			/**
			 * this methods accepts the details of the person such as 
			 * Name_of_Person
			 * and address related fields such as
			 * street_name
			 * city_name
			 * country_name
			 * zipcode
			 */
			public void acceptPersonDetails()
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("\n");
				System.out.print("Enter the name \t");
				this.name=sc.nextLine();
				System.out.print("Enter the street name \t");
				this.street=sc.nextLine();
				System.out.print("Enter the city \t");
				this.city=sc.nextLine();
				System.out.print("Enter the country \t");
				this.country=sc.nextLine();
				System.out.print("Enter the zipcode \t");
				this.zipcode=sc.nextInt();
	
			}
		
	
			
		
			
			
		
			 // this method displays the details of the persons stored in the address book.	 
			public void displayPersonDetails()
			{
				System.out.println("\n\nHello The Details are.... ");
				System.out.println("Name is: " + name);
				System.out.println("Street is: "+ street);
				System.out.println("City is:  "+ city);
				System.out.println("Country is: "+ country);
				System.out.println("City is:  "+ zipcode);	
			}
			
			
			
			
			
		
			//Entry Point Function
			public static void main(String arg[])
			{
				
				int choice=0;
				int objectIndex=0;		//This variable is used to iterate through the array of objects.
				boolean flag=false;		//flag variable to check the record is present in the AddressBook or not. 
				
				Scanner scn=new Scanner(System.in);
				
				
				//This is an array of objects which stores the objects as its members.
				AddressDemo1 obj[]=new AddressDemo1[20];
				
				
				do
				{
					System.out.println("#============== Address Book Menu =================#");
					
					System.out.println("\n");
					System.out.println("1. Create New Address");
					System.out.println("2. Show all Addresses");
					System.out.println("3. Find By Name");
					System.out.println("4. Delete by Name");
					System.out.println("5. Update");
					System.out.println("6. Exit");
					System.out.println("Enter your choice....\t");
					
					choice=scn.nextInt();
					
				
					
					switch(choice)
					{
						//Case 1 creates a new object every time and accepts the details of a person.
						case 1:
							obj[objectIndex]=new AddressDemo1();
							obj[objectIndex].acceptPersonDetails();
							objectIndex++;
							break;
							
							
							
						//Case 2 displays the details of all the people whose details are stored  in the AddressBook 	
						case 2:
							if(objectIndex<=0)
							{
								System.out.println("No Records in AddressBook to show....\n");
							}
							
							
							
							for(int cnt=0;cnt<objectIndex;cnt++)
							{
								obj[cnt].displayPersonDetails();
							}
							break;
							
							
							
						//Case 3 Finds a specific persons details whose name is used  as a parameter to search through the AddressBook.	
						case 3:
							System.out.println("\nEnter the name whose details are to be found ");
							Scanner scnn=new Scanner(System.in);
							String findByName=scnn.nextLine();
						     
							for(int j=0;j<objectIndex;j++)
							{
								if(obj[j].name.equals(findByName)== true)
								{
									flag=true;		//Flag variable set to true if the record is found.
									
									System.out.println("\nRecord Found");
									obj[j].displayPersonDetails();
								}
								
								
							}
							
						
							if(flag==false)		//Condition to check whether record is present or not.
							{
								System.out.println("\nRecord not found\n");
							}
						
							flag=false;
							
							break;
							
						
							
							
							
							
						//Case 4 is used to  delete a persons record using a name  passed by the user.
						case 4:
							String deleteByName;
							int cnt1=0,loopcnt=0;
							
							Scanner scann=new Scanner(System.in);
							
							System.out.println("Enter the name whose record is to be to be deleted");
							deleteByName=scann.nextLine();
							
							for(cnt1=0;cnt1<objectIndex;cnt1++)
							{
								if(obj[cnt1].name.equals(deleteByName)== true)		//Check if the name matches with the records(AddressBook)
								{
									flag=true;
									obj[cnt1]=obj[objectIndex-1];
									objectIndex--;
									
									System.out.println("\nRecord Deleted succesfully...\n");
									break;
								}
								
							}
							
							
				
							if(flag==false)		//Condition to check whether record is present or not.
							{
								System.out.println("\nThe Record which is to be deleted is not found...\n");
							}
							
							flag=false;
							
							break;
						
						
							
						
							
						//Case 5 is used to Update the details of a person by accepting the name from the user whose details are to Updated.	
						case 5:
							Scanner scanner=new Scanner(System.in);
							System.out.println("Enter the name whose details are to be updated");
							String nameToUpdate=scanner.nextLine();
							int cnt2=0;		//Variable to iterate through AddressBook.
							
							for(cnt2=0;cnt2<objectIndex;cnt2++)
							{
								if(obj[cnt2].name.equals(nameToUpdate)== true)
								{
									flag=true;
									
									System.out.println("Enter the new address");
									
									System.out.println("\nEnter the new street");
									obj[cnt2].street=scanner.nextLine();
									
									System.out.println("Enter the new City");
									obj[cnt2].city=scanner.nextLine();
									
									System.out.println("Enter the new Country");
									obj[cnt2].country=scanner.nextLine();
									
									System.out.println("Enter the new zipcode");
									obj[cnt2].zipcode=scanner.nextInt();
									
									System.out.println("\nRecord Updated succesfully...\n");
									
									break;
									
								}
							}
				
							if(flag==false)		//Condition to check whether record is present or not.
							{
								System.out.println("Record which is to be updated is not found!!!!");
							}
								
							flag=false;
							
								break;
		

							
							
						case 6:
							System.out.println("Thank You Visit Again... ");
							break;
							
							
					
					}
					
					}while(choice!=6);
				
				}
			
}
