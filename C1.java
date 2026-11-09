import java.util.*;
class A3a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double S1,S2,S3,S4,S5,t,per;
		System.out.println("Enter S-1 marks: ");
		S1 = sc.nextDouble();
		System.out.println("Enter S-2 marks: ");
		S2 = sc.nextDouble();
		System.out.println("Enter S-3 marks: ");
		S3 = sc.nextDouble();
		System.out.println("Enter S-4 marks: ");
		S4 = sc.nextDouble();
		System.out.println("Enter S-5 marks: ");
		S5 = sc.nextDouble();
		sc.close();
		t = S1+S2+S3+S4+S5;per = t/5;
		System.out.println("Total marks: "+t);
		System.out.println("Precentage: "+per);
	}
}