import java.util.Scanner;
public class multiplysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
       // int start=sc.nextInt();
      // System.out.println("enter the number");
        int num=sc.nextInt();
        int multiply=0;
        int sum=0;
        for(int i=1;i<=10;i++){
           multiply=i*num;
           
           System.out.println(multiply);
           sum=sum+multiply;
            
        }
        
        System.out.println("sum:"+sum);
        
        
    }

    
}



/*enter the number
5
5
10
15
20
25
30
35
40
45
50
sum:275 */
