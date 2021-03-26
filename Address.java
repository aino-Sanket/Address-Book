import java.util.Scanner;

public class Address 
{
	
	public String name;
	public String street;
	public String city;
	public String country;
	public int zipcode;
	
	
		//Default Constructor
		public Address()
		{
			this.name=null;
			this.street=null;
			this.city=null;
			this.country=null;
			this.zipcode=0;
		}
		
	
		
			//Accept the details of people.
			public void Accept()
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
		
	
			
			//Display the details of people.
			public void Display()
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
				int i=0;
				
				Scanner scn=new Scanner(System.in);
				
				Address obj[]=new Address[20];
				
				System.out.println("#============== Address Book Menu =================#");
				do
				{
					System.out.println("\n");
					System.out.println("1. Create New Address");
					System.out.println("2. Show all Addresses");
					System.out.println("3. Exit");
					System.out.println("Enter your choice....\t");
					
					choice=scn.nextInt();
					
				
					
					switch(choice)
					{
						
						case 1:
							obj[i]=new Address();
							obj[i].Accept();
							i++;
							break;
							
						case 2:
							for(int cnt=0;cnt<i;cnt++)
							{
								obj[cnt].Display();
							}
							break;
							
						case 3:
							System.out.println("Thank You Visit Again... ");
							break;
							
							
					
					}
					
					}while(choice!=3);
				
				}
			
}
