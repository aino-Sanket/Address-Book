/**
 * 
 * @author intern-1
 *
 *<h1>This class has all the functionalities of menu-items</h1>
 *
 *<p>In this class we initialize the restaurant menu-items and displays them</p>
 *
 *
 */
		 


public class RestaurantMenuItem extends MenuItem
{
		public String menuItemTitle;
		public int price;
		
		
			//Initialize the current menu-item.
			public RestaurantMenuItem(String menuItemTitle,int price)	
			{
				super(menuItemTitle);
				this.setMenuItemprice(price);
			}
			
			
			
			//set the current Menu-Item name
			public void setMenuItemprice(int price)	
			{
				this.price=price;
			}
			
			//returns the current menu item.
			public String getMenuItemDetails()
			{
				return super.getMenuItemTitle() +"    Rs: " +this.price;
			}
			
			
			
			//Displays the current menu item.
			public void displayMenuItem()
			{
				System.out.print(super.menuItemTitle + "   Rs "+this.price);
			}

		

}
