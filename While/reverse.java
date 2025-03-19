import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int rem=0;
        int reverse=0;
        while(end >=num){
            rem=num/10;
            reverse=reverse*10+rem;
          System.out.println(end);
        end--;

        }
        
       
    }
    
}
