import java.util.Scanner;

public class AddressDemo1
{
	
	public String name;
	public String street;
	public String city;
	public String country;
	public int zipcode;
	
	
		//Default Constructor
		public AddressDemo1()
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
			
			
			public void findByName(AddressDemo obj,String nametofind)
			{
				for(int i=0;i<obj.length;i++)
				{
					
				}
			}
		
		
		
		
			//Entry Point Function
			public static void main(String arg[])
			{
				
				int choice=0;
				int i=0;
				
				Scanner scn=new Scanner(System.in);
				
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
						
						case 1:
							obj[i]=new AddressDemo1();
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
							System.out.println("\nEnter the name whose details are to be found ");
							Scanner scnn=new Scanner(System.in);
							String find_by_name=scnn.nextLine();
							int cnt=0;
							for(int j=0;j<i;j++)
							{
								if(obj[j].name.equals(find_by_name)== true)
								{
									System.out.println("\nRecord Found");
									obj[j].Display();
								}
								
								else
								{
									cnt++;
								}
							}
							if(cnt==i)
							{
								System.out.println("\nRecord not found\n");
							}
						
							//System.out.println("Record not found");
							break;
							
						
							
						case 4:
							String deleteByName;
							int cnt1=0,loopcnt=0;
							
							Scanner scann=new Scanner(System.in);
							
							System.out.println("Enter the name whose record is to be to be deleted");
							deleteByName=scann.nextLine();
							
							for(cnt1=0;cnt1<i;cnt1++)
							{
								if(obj[cnt1].name.equals(deleteByName)== true)
								{
									obj[cnt1]=obj[i-1];
									i--;
									
									System.out.println("\nRecord Deleted succesfully...\n");
									break;
								}
							/*	else
								{
									loopcnt++;
								}
							*/
								
							}
							if(cnt1 > i-1)
							{
								System.out.println("\nThe Record which is to be deleted is not found...\n");
							}
							
							break;
						
						
						case 5:
							Scanner scanner=new Scanner(System.in);
							System.out.println("Enter the name whose details are to be updated");
							String NameToUpdate=scanner.nextLine();
							
							for(int cnt2=0;cnt2<i;cnt2++)
							{
								if(obj[cnt2].name.equals(NameToUpdate)== true)
								{
									System.out.println("Enter the new address");
									
									System.out.println("\nEnter the new street");
									obj[cnt2].street=scanner.nextLine();
									
									System.out.println("Enter the new City");
									obj[cnt2].city=scanner.nextLine();
									
									System.out.println("Enter the new Country");
									obj[cnt2].country=scanner.nextLine();
									
									System.out.println("Enter the new zipcode");
									obj[cnt2].zipcode=scanner.nextInt();
									
									System.out.println("\nRecord Deleted succesfully...\n");
									
								}
							}
								
								break;
							
							
						case 6:
							System.out.println("Thank You Visit Again... ");
							break;
							
							
					
					}
					
					}while(choice!=6);
				
				}
			

}
