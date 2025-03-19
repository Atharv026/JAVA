import java.util.*;
public class leapyear {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int y=sc.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0){
          System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
 }
    
}

/*enter the number
2028
it is a leap year */
