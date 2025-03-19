import java.util.Scanner;
public class ifelseeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        if(num%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
    
}


/*enter the number
234
it is even number */



/*enter the number
5
it is odd number */

