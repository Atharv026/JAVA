import java.util.Scanner;
public class whileevendigitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;
        int rem=0;
        int count=0;
        while(num>0){
            rem=num%10;
            if(rem%2==0){
                sum=sum+rem;
            }
            
            count++;
            num=num/10;
        }
        System.out.println("sum:"+sum);
    }
    
}


/*
 * enter the number
12345
sum:6
 */


 /*
 enter the number
8796
sum:14 */
