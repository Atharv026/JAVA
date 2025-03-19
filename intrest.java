import java.util.Scanner;
public class intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount ");
        double a=sc.nextDouble();
        System.out.println("enter the year");
        double b=sc.nextDouble();
        System.out.println("enter the rate");
        double c=sc.nextDouble();
       
        double intrest=a*b*c/100;
        System.out.println(intrest);
        System.out.println(a+intrest);
        


    }
    
}


/*enter the amount 
8000
enter the year
4
enter the rate
20
6400.0 */
