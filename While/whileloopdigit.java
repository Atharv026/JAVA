import java.util.Scanner;
public class whileloopdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int count=0;
        int rem=0;
        int sum=0;
        while(num>0){
            rem=num%10;
         count++;
        
          num=num/10;
           

        }
        System.out.println("count:"+count);
          
        }
        
    }


    /*
    enter the number
     123
     count:3 */
   

