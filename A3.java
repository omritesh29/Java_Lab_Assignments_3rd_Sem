import java.lang.*;
class Swap{
	public static void main(String args[]){
		int a = 30;
		int b = 50;
		int temp;

		temp = a;
		a = b;
		b = temp;
		System.out.println("1st number = "+a);
		System.out.println("2nd number = "+b);
	}
}