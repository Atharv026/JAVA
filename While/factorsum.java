import java.util.Scanner;
public class factorsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int fact=1;
        int sum=0;
        while(fact<num){
            if(num%fact==0){
                sum=sum+fact;

            }
        fact++;
        }
        System.out.println("sum:"+sum);
    }
    
}


/*enter the number
12
sum:16 */
