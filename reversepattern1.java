import java.util.Scanner;
public class reversepattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=3;i>=1;i--){
            for(int j=3;j>=1;j--){
                System.out.println(i);
            }
            System.out.println();
        }
    }
    
}
