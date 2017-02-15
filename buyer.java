package ecommerce;

import java.util.*;




public class buyer extends seller {
	
	String name,email;
	Hashtable<String,String> bm=new Hashtable<String,String>(); 
	  HashSet<String> hashset=new HashSet<String>();  
	  HashSet<String> wishset=new HashSet<String>(); 
	Scanner sc=new Scanner(System.in);
	public void welcome_buyer()
	{
		int cho=0;
		while(cho!=100)
		{
		System.out.println("Welcome buyer. What would you like to do today?");
        System.out.println("Enter choice:1.create profile 2.view profile 3.search products 4.add to cart 5. add to wishlist 6. checkout 7. see wishlist 8. logout  ");
        
        cho=sc.nextInt();
        switch(cho)
        {
        case 1:
        	create_profile();
            break;
        case 2:
        	view_profile();
        	break;
        case 3:
        	see_products();
        	break;
       
        case 4:
        	add_to_cart();
        	break;
        case 5:
        	add_to_wishlist();
        	break;
        case 6:
            process_cart();
            break;
        case 7:
        	wish_list();
        	break;
        case 8:
        	logout();
        	break;
        	
        }
	}
}
	public void create_profile()
	{
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your email");
		email=sc.next();
		bm.put(email,name);
		System.out.println("Your profile was created successfully");
	}
	public void view_profile()
	{
		
		System.out.println("Enter your email");
		email=sc.next();
		System.out.println("Welcome " +bm.get(email));
	}
	public void see_products()
	{
		int i;
		System.out.println("Enter your email");
		email=sc.next();
		if(bm.get(email)!=null)
		{
			 Set<String> keys = hm.keySet();
			 System.out.println("The products are:");
		        for(String key: keys){
		            System.out.println("Product id: "+key+"name: "+hm.get(key));
		        }
		
		}
	}
	public void add_to_cart()
	{
		String id;
		System.out.println("Enter your email");
		email=sc.next();
		if(bm.get(email)!=null)
		{
			Set<String> keys = hm.keySet();
			System.out.println("Enter product id to add to cart");
			id=sc.next();
			 for(String key: keys){
			 if(key.equalsIgnoreCase(id)){
				 System.out.println("Product :"+hm.get(key)+" is added to cart.");
				 hashset.add(hm.get(key));
			 }
			
			
		}
	}
	
	
	
	}
	public void add_to_wishlist()
	{
		String id;
		System.out.println("Enter your email");
		email=sc.next();
		if(bm.get(email)!=null)
		{
			Set<String> keys = hm.keySet();
			System.out.println("Enter product id to add to cart");
			id=sc.next();
			 for(String key: keys){
			 if(key.equalsIgnoreCase(id)){
				 System.out.println("Product :"+hm.get(key)+ "is added to wishlist.");
				 wishset.add(hm.get(key));
			 }
			
			
		}
	}
	
	
	
	}
	public void process_cart()
	{
		  int count=0;
		  String ch;
		  Iterator<String> itr=hashset.iterator();  
		  System.out.println("The products available in cart are");
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   count++;
		  }  
		  System.out.println("Are you sure to proceed to checkout?(y/n)");
		  ch=sc.nextLine();
		  if(ch.equalsIgnoreCase("y"))
		  {
			  System.out.println("Order with "+count+" products was checked out.");
		  }
		  else
		  {
			  System.out.println("Order with "+count+" products was failed.");
		  }
	}
	public void wish_list()
	{
		Iterator<String> itr=wishset.iterator();  
		  System.out.println("The products available in wishlist are");
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		 
		  }  
	}

}