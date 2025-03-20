import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println("sum:"+ sum);
    }
    
}


/*
 *
 enter the number
1
enter the number
10
sum:55
 */
