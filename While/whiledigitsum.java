import java.util.Scanner;
public class whiledigitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int rem=0;
        int sum=0;
        int count=0;
        while(num>0){
            rem=num%10;
           sum=sum+rem;
           count++;
            num=num/10;
           
            

        }
        System.out.println("sum:"+sum);
    }
    
}


/*enter the number
1234
sum:10 */
