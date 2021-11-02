package com.xworkz.FoodDTO;

public class FoodDAO {
	private FoodDTO[] Container=new FoodDTO[6];
	private int count;
	private static  int Items;
	public FoodDAO()
	{
		System.out.println("invoked food DAO");
	}
	public void add(FoodDTO foodDTO)
	{
		if(foodDTO!=null && this.count<this.Container.length)
		{
			this.Container[count]=foodDTO;
			System.out.println("Added FoodDTO ".concat(" ").concat(String.valueOf(this.count)).concat(" ").concat( " ").concat(String.valueOf(foodDTO.getId())));
			this.count++;
		}
			else
			{
				System.err.println("container may be full or null may be passed");
			}
	}
	
	
	

	public void updatePriceByName(String name,double price)
	{
		if(name!=null && price>0)
		{
			for(int recipie=0; recipie<this.Container.length; recipie++)
			{
				FoodDTO order=this.Container[ recipie];
				if(order!=null)
				{
					String foodname =order.getName();
					if(foodname.equals(name))
					{
						System.out.println("match".concat(" ").concat(foodname).concat(" ").concat(" ").concat(" ").concat(String.valueOf(order.getPrice())));
						order.setPrice(price);
						System.out.println("the price is updated ....".concat(String.valueOf(order.getPrice())));
					}
					else
					{
						System.out.println("matched");
					}
				}
				else
				{
					System.out.println("NotMatched");
				}
				}
				
			}
		}

	
	
	
	public void updateQuantityByName(String name,int quantity)
	{
		if(name!=null && quantity>0)
		{
			for(int i=0;i<this.Container.length;i++)
			{
				FoodDTO order=this.Container[i];
				if(order!=null)
				{
					String nameOfFood =order.getName();
					
					if(nameOfFood.equals(name))
					{
						System.out.println("NAME MATCHED".concat(" ").concat(nameOfFood).concat(" ").concat("AND UPADATING QUANTITY").concat(" ").concat(String.valueOf(order.getQuantity())));
						order.setQuantity(quantity);
						System.out.println("UPDATED QUANTITY - ".concat(String.valueOf(order.getQuantity())));
					}
					else
					{
						System.out.println("FOOD IS NOT MATCHED");
					}	
					
			   }
			}
		}
	}
	
	
	
	
	public void findByName(String name) 
	{
		if(name!=null)
		{
			for(int i=0;i<this.Container.length;i++)
			{
				FoodDTO order=this.Container[i];
				if(order!=null)
				{
					String nameOfFood =order.getName();
					if(nameOfFood.equals(name))
					{
						System.out.println("name is matched".concat(order.getName()));
						
					}
					else
					{
						System.out.println("NAME IS NOT MATCHED");
					}
				}
			}
		}
	}
	
	
	
	public void findByNameAndPrice(String name,double price) 
	{
		if(name!=null && price>0)
		{
			for(int jar=0;jar<this.Container.length;jar++)
			{
				FoodDTO food1=this.Container[jar];
				if(food1!=null)
				{
					String nameOfFood =food1.getName();
					double amt=food1.getPrice();
					if(nameOfFood.equals(name)&& amt==price)
					{
						System.out.println("NAME is matched".concat(food1.getName()).concat(" ").concat(" ").concat(" ").concat(String.valueOf(food1.getPrice())).concat(" ").concat("IS MATCHED"));
						
					}
					else
					{
						System.out.println("not matched");
					}
				}
			}
		}
	}
	
	
	
	
	public void findByNameAndType(String name,FoodType type) 
	{
		if(name!=null && type!=null)
		{
			for(int i=0;i<this.Container.length;i++)
			{
				FoodDTO order=this.Container[i];
				if(order!=null)
				{
					String nameOfFood =order.getName();
					FoodType foodType=order.getType();
					if(nameOfFood.equals(name)&& foodType==type )
					{
						System.out.println("findByNameAndTYpe".concat(order.getName()).concat(" ").concat("AND TYPE-").concat(" ").concat(String.valueOf(order.getType())).concat(" ").concat("IS MATCHED"));
						
					}
					else
					{
						System.out.println("findByNameAndTYpe  .....Name and type is not  Matched");
					}
				}
			}
		}
	}
	
	
	
	
	public void displayDetails()
	{
		for(int test=0;test<this.Container.length;test++)
		{
			FoodDTO food1=this.Container[test];
			if(food1!=null)
			{
			 
				System.out.println(String.valueOf(food1.getId()).concat(" ").concat(food1.getName()).concat(" ").concat(String.valueOf(food1.getType())).concat(" ").concat(String.valueOf(food1.getPrice())).concat(" ").concat(String.valueOf(food1.getQuantity())));
			}
			
		}
		
	}
	
	
	
	
	
		public void printTotalFoodItems()
		{
			for(int i=0;i<this.Container.length;i++)
			{
				FoodDTO order=this.Container[i];
				if(order!=null)
				{
					int newOrder=order.getQuantity();
				FoodDAO.Items=FoodDAO.Items+newOrder;
				}
				
			}
			System.out.println(FoodDAO.Items);
		
		}}
