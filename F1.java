import java.util.Scanner;

  class f1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After bubble sort");
        for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}