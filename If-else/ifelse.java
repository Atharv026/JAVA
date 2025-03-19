import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
        if(a<b){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("b is greater than a");
        }

    }
    
}










/*enter the number
10
enter the number
20
a is less than b */



/* enter the number
30
enter the number
10
b is less than a*/
