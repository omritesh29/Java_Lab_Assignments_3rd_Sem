import java.util.*;
//import java.lang.*;
class c5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array:");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter "+n+" elements");
for(int i=0;i<n;i++){
a[i] = sc.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
int temp =a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
System.out.println("Sorted Array: ");
for(int x : a){
System.out.println(x+ " ");
}
sc.close();
}
}

