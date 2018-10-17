import java.util.Scanner;

/**
 * 
 * @author Jugat Singh
 *
 */
public class Stock_Calculator 
{

	public static void main(String[] args) 
	
	{

		Scanner user= new Scanner(System.in);
		
		System.out.println("Stock Calculator:");
		
		System.out.print("Please enter the number of shares purchased: ");
		String Strnum_shares= user.nextLine();
	
		System.out.print("Please enter the price paid per share: ");
		String Strpps= user.nextLine();
		
		System.out.print("Please enter the commission rate for the purchase as a decimal: ");
		String StrcommisionPurchase= user.nextLine();
		
		System.out.print("Please enter the sale price per share: ");
		String Strspps= user.nextLine();
		
		System.out.print("Please enter the commission rate on the sale as a decimal: ");
		String StrcommisionSale= user.nextLine();
		
		//change to double
		
		double num_shares= Double.parseDouble(Strnum_shares);
		double pps= Double.parseDouble(Strpps);
		double commisionPurchase= Double.parseDouble(StrcommisionPurchase);
		double spps= Double.parseDouble(Strspps);
		double commisionSale= Double.parseDouble(StrcommisionSale);
		
		//calculation
		
		double totalPaid= num_shares*pps;
		double totalCommisionPurchase= totalPaid*commisionPurchase;
		double totalSale= num_shares * spps;
		double totalCommisionSale= totalSale* commisionSale;
		double net= totalSale-totalPaid-totalCommisionPurchase-totalCommisionSale;
		
		//display output
		
		System.out.println("\n\nTotal paid for " + num_shares+" shares: $"+ totalPaid );
		System.out.println("Commision on purchase: $"+totalCommisionPurchase);
		System.out.println("Total sale price for "+ num_shares+ " shares: $"+ totalSale);
		System.out.println("Commision on sale: $"+ totalCommisionSale);
		System.out.println("Net gain/loss: $"+ net);
		
		
		
		
		
		
		
		

	}

}