import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    int perf=1;
    int sum=0;
   int temp=num;
    while(perf<num){
        if(num%perf==0){
            sum=sum+perf;
            System.out.println(perf);
            
        }
         perf++;
    }
    if(sum==temp){
System.out.println("it is a perfect number");
    }
    else{
        System.out.println("it is not a perfect number");
    }

    }
    
}
