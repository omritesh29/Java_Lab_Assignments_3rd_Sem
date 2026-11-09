import java.util.Scanner;
class f2 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int sum=0;
         System.out.println("Enter no of elements");
         int n =sc.nextInt();
         int a[]=new int[n];
         System.out.println("Enter "+n+" elements");
         for (int i=0;i<n;i++){
             a[i]= sc.nextInt();
         }
         for (int i=0;i<n;i++){
              sum=sum+a[i];
         }
         int avg=sum/n;
         System.out.println("The average is "+avg);

     }
}