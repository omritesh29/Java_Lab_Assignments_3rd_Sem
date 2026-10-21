import java.lang.*;
class Swap1{
	public static void main(String args[]){
		int a = 10;
		int b = 20;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("1st number = "+a);
		System.out.println("2nd number = "+b);
	}
}