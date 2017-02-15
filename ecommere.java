package ecommerce;
import java.util.*;


public class ecommere {
	
	
	public void get_user(){
		
		int choice;
		System.out.println("Welcome to ecommerce");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice : 1.Seller 2.Buyer");
		choice=sc.nextInt();
		//System.out.println("choice is"+choice);
		while(choice!=1 && choice!=2)
		{
			System.out.println("Enter a valid choice");
			System.out.println("Enter choice : 1.Seller 2.Buyer");
			choice=sc.nextInt();
		}
		if(choice==1)
		{
			seller s=new seller();
			s.welcome_seller();
			
		}
		else
		{
			buyer b=new buyer();
			b.welcome_buyer();
		}
	}
	public static void main(String a[])
	{
		ecommere user=new ecommere();
		user.get_user();
	
		
		

	}
	
	

}
