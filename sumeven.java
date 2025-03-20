import java.util.Scanner;
public class sumeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("sum:"+sum);
    }
    
}

/*

enter the number
2
enter the number
20
sum:110
 */
