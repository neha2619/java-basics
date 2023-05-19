import java.util.*;
public class Loops {
    public static void main(String[] args){
        // for(int i=0;i<10;i++){
        //     System.out.println(i+1);

        // }
        int i=0;
        // while(i<10){
        //     System.out.println(i+1);
        //     i++;
        // }
    // do{
    //     System.out.println("hii");
    //     i++;
    // }
    // while(i<10);
    //Sum of n natural number
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the Number");
    // int n=sc.nextInt();
    // int mul=n;
    // for(i=1;i<=10;i++){
    //     mul=n*i;  
    //     System.out.println(n+" x "+i+" = "+mul);     
    // }
    int ch;
    do{
        System.out.println("Enter your marks");
        int m=sc.nextInt();
        if(m>=90){
            System.out.println("This is Good");
        }
        else if(m<=89 && m>=60){
            System.out.println("This id also Good");
        }
        else{
            System.out.println("This is Good as well");
        }
        System.out.println("Do you want to continue?\nIf YES press 1 and for No press 0");
         ch=sc.nextInt();
    }
    
    while(ch==1);

   
    }

}
