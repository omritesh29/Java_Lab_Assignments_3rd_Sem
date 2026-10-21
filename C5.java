import java.util.*;
class A3e{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double buy,sell,diff,lp,pp;
		System.out.println("Enter buy price: ");
		buy = sc.nextDouble();
		System.out.println("Enter sell price: ");
		sell = sc.nextDouble();
		sc.close();
		if(buy==sell)
			System.out.println("No Profit/Loss");
		else if(buy>sell){
			diff = buy-sell;
			lp = diff*100/buy;
			System.out.println("Loss percentage: "+lp+"%");
		}
		else{
			diff = sell-buy;
			pp = diff*100/buy;
			System.out.println("Profit Percentage: "+pp+"%");
		}
	}
}