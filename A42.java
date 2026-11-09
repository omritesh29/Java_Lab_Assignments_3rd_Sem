import java.lang.*;
import java.util.Scanner;
public class A42{
	public static void main(String SCP[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 1st floating point number: ");
		double n1 = sc.nextDouble();
		System.out.print("Input 2nd floating point number: ");
		double n2 = sc.nextDouble();
		if(Math.round(n1*1000) == Math.round(n2*1000)){
			System.out.println("They are the same upto 3 decimal places.");
		}
		else{
			System.out.println("They are different.");
		}
		sc.close();
	}
}