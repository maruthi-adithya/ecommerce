package ecommerce;

import java.util.*;

public class Seller extends Ecommerce{

	String name,email;
	int end=0;

	  Hashtable<String,String> hm=new Hashtable<String,String>(); 
	  Hashtable<Integer,String> pm=new Hashtable<Integer,String>();
	 // Hashtable<String,String> hm=new Hashtable<String,String>();
	  
	Scanner sc=new Scanner(System.in);
	public void welcome_seller()
	{
		int cho=0;
		while(cho!=100)
		{
		System.out.println("Welcome seller. What would you like to do today?");
        System.out.println("Enter choice:1.create profile 2.view profile 3.add products 4.list products 5. interested users 6.logout ");
        
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
        	add_products();
        	break;
        case 4:
        	list_products();
        	break;
        case 5:
        	break;
        case 6:
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
		hm.put(email,name);
		System.out.println("Your profile was created successfully");
	
	}
	public void view_profile()
	{
		
		System.out.println("Enter your email");
		email=sc.next();
		System.out.println("Welcome " +hm.get(email));
	}
	public void add_products()
	{
		int prod,i;
		String product;
		System.out.println("Enter your email");
		email=sc.next();
		if(hm.get(email)!=null)
		{
			int hash=email.hashCode();
			System.out.println("How many products do u wish to add?");
			prod=sc.nextInt();
			for(i=1;i<=prod;i++)
			{
				hash=hash+i;
				System.out.println("Enter product name");
				product=sc.next();
				pm.put(hash,product);
				hash=hash-i;
				
				
			}
			end=end+prod;
		}
	}
	public void list_products()
	{
		int i;
		System.out.println("Enter your email");
		email=sc.next();
		if(hm.get(email)!=null)
		{
			int hash=email.hashCode();
			for(i=1;i<=end;i++)
			{
				hash=hash+i;
				if(pm.get(hash)!=null)
				{
				System.out.println("NAME:"+ pm.get(hash));
				}
				hash=hash-i;
				
			}
		}
	}
	public void logout()
	{
		ecommere user=new ecommere();
		user.get_user();
		
	}
	
	
}
