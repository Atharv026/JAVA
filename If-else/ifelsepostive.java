import java.util.Scanner;
public class ifelsepostive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        if(num>0){
            System.out.println("it is positive number");
        }
        else{
            System.out.println("it is negative number");
        }
    }
    
}

/*enter the number
3
it is positive number */




/*enter the number
-6
it is negative number */
