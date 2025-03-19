import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the mark of english");
       int a=sc.nextInt();
       System.out.println("enter the mark of hindi");
       int b=sc.nextInt();
       System.out.println("enter the mark of marathi");
       int c=sc.nextInt();
       System.out.println("enter the mark of math");
       int d=sc.nextInt();


    
         
        if(a>=90 && a<=100){
            System.out.println("Student got A+");
 }
        else if(a>=80 && a<=90){
            System.out.println("Student got B+");

        }
        else if(a>=70 && a<=60){
             System.out.println("Student got C+");
        }
        else if(a>=50 && a<=40){
            System.out.println("Student got D+");
        }
        else{
            System.out.println(" student got E+ ");
        }
        
        }
    }
    

/*enter the mark of english
98
enter the mark of hindi
99
enter the mark of marathi
99
enter the mark of math
95
Student got A+ */