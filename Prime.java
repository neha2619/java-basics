import java.util.*;
public class Prime {
    public static void main(String[] args){
        int c=0;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }            
        }
        if(c>2){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

