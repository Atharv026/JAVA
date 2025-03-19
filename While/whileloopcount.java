import java.util.Scanner;
public class whileloopcount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int count=0;
        while(start<=end){
           // System.out.println(start);
            start++;
            count++;
            }
            System.out.println("count:"+count);
    }
    
}



/*enter the number
26
enter the number
55
count:30 */
