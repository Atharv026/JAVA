import java.util.Scanner;
public class whileoddsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int sum=0;
        while(start<=end){
            if(start%2!=0){
               sum=sum+start;
               
            }
            start++; 
            //System.out.println("sum:"+sum);
        }
        System.out.println("sum:"+sum);
    }
    
}


/*enter the number
1
enter the number
10
sum:25 */
