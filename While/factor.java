import java.util.Scanner;
public class factor {
    public static void  main(String [] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int fact=1;
        
        
         while(fact<num){
            
            if(num%fact==0){
            System.out.println(fact);

            }

          fact++;
         }
           

    }
    
}

/*Enter the number
6
1
2
3 */

/*Enter the number
8
1
2
4 */
