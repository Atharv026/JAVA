import java.util.Scanner;
public class whileloopfact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
       // System.out.println("enter the number");
        //int end=sc.nextInt();
        int fact=1;
        while(num>=1){
            fact=fact*num;
            num--;
        }
        
        System.out.println(fact);
    }
    
}


/*enter the number
5
120 */
