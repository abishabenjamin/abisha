import java.util.*;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<=n;i++){
            for( j=0;j<n-i;j++){
                System.out.print(" ");
            }
                for( j=0;j<(2*i)-1;j++){
                    System.out.print("*");
                }
                
            System.out.println();
        }
    }
}
