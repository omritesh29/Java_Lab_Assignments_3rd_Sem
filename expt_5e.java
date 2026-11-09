import java.util.*;
class e5{
public static void main(String args[]){
int i,j,k,c=0;
for (i=1;i<=3;i++){
for (j=1;j<=3;j++){
for(k=1;k<=3;k++){
if(i!=j && i!=k && j!=k){
System.out.println(i+" "+j+" "+k);
c++;
}
}
}
}
System.out.println("Total ele: "+c);
}
}