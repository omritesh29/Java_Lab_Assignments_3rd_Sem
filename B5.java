import java.lang.*;
class Convertion{
	public static void main(String args[]){
		int minutes = 20000;
		int days1 = minutes/1440;
		int years = days1/365;
		int days = days1 % 365;
		System.out.println("Years= "+years);
		System.out.println("Days= "+days);
	}
}