
import java.util.Scanner;

public class starpattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the star number");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }
        
    }
    
}


/*enter the star number
3
* * * 
* * *
* * *
 */
