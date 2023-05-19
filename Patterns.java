import javax.swing.plaf.synth.SynthLookAndFeel;

public class Patterns {
    public static void main(String[] args){
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }




        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         if((i==1||i==2)&&(j==1||j==2||j==3)){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }




        // for(int i=0;i<4;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 




        //   int n=4;
        //   for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //   } 




            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=4-i;j++){
            //        System.out.print(" ");
            //     }
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }



        // for(int i=1;i<=5;i++){
        //     int n=1;
        //     for(int j=0;j<i;j++){
        //         System.out.print(n+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }



        // for(int i=0;i<5;i++){
            
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }




        // int n=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(n+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }




        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0)
        //         System.out.print(1+" ");
        //         else
        //         System.out.print(0+" ");
        //     }
        //     System.out.println();
        // }




        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=5;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //     //IGNORE this code
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        


        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(4-i);k++){
                  
                System.out.print(" ");
            }
           
            for(int m=0;m<i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(i);k++){
                  
                System.out.print(" ");
            }
           
            for(int m=0;m<4-i;m++){
                System.out.print("*");
            }
            System.out.println();
        }




        

    } 
}
