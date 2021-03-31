
public class RestaurantMenuItem
{
		public String menuItemTitle;
		public int price;
		
		
			//Initialize the current menu-item
			public RestaurantMenuItem(String menuItemTitle,int price)	
			{
				this.setMenuItemTitle(menuItemTitle,price);
			}
			
			
			
			//set the current Menu-Item name
			public void setMenuItemTitle(String menuItemTitle,int price)	
			{
				this.menuItemTitle=menuItemTitle;
				this.price=price;
			}
			
			//returns the current menu item.
			public String getMenuItemTitle()
			{
				return this.menuItemTitle +"    Rs: " +this.price;
			}
			
			
			//Displays the current menu item.
			public void displayMenuItem()
			{
				System.out.print(this.menuItemTitle + "   Rs "+this.price);
			}

		

}
