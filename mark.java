import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the marks of Math");
        double a=sc.nextDouble();
        System.out.println("enter the marks of Marathi");
        double b=sc.nextDouble();
        System.out.println("enter the marks of English");
        double c=sc.nextDouble();
        System.out.println("enter the marks of Hindi");
        double d=sc.nextDouble();
        double total=a+b+c+d;
double percentage=(total/4);

         System.out.println(total);
         System.out.println(percentage);   

    }
    
}


/*enter the marks of Math
98
enter the marks of Marathi
90
enter the marks of English
93
enter the marks of Hindi
94
375.0
93.75enter the marks of Math
98
enter the marks of Marathi
90
enter the marks of English
93
enter the marks of Hindi
94
375.0
93.75 */
