import java.util.Scanner;
public class conditionifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("b is less than a");
        }
        else{
            System.out.println("a is greater than b");
        }
    }
    
}

/*enter the number
20
enter the number
10
b is less than a */
