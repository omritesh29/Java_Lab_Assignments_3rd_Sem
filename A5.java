import java.lang.*;
class Tarea{
	public static void main(String args[]){
		int a = 3;
		int b = 4;
		int c = 5;
		int s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle = "+area);
	}
}