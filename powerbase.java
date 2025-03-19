import java.util.Scanner;
public class powerbase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");

        int base=sc.nextInt();
        System.out.println("enter the exponent");
        int exponent=sc.nextInt();
    int power=1;
        for(int i=1;i<=exponent;i++){
            power *= base;

        }
        System.out.println(power);

    }
    
}


/*enter the base
3
enter the exponent
4
81 */
