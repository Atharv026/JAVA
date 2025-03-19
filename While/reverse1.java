import java.util.Scanner;
public class reverse1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int reverse=0;
        int rem=0;
         int temp=num;
        while(num>0){
            rem=num%10;
            reverse=reverse*10+rem;
           num=num/10;
        //num--;
        }
        
       System.out.println("reverse:"+reverse);


       if(reverse==temp){
        System.out.println("it is a palliodrome");
       }
       else{
        System.out.println("it is not a palliodrome");
       }

    }
    
}


/*enter the number
121
reverse:121
it is a palliodrome */
