import java.util.Scanner;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
System.out.println("enter the number");
int start=sc.nextInt();
System.out.println("enter the number");
int end=sc.nextInt();
        


        for(int i=start;i<=end;i++){
            count++;

        }
        System.out.println("count :"+count);

    }
    
}
