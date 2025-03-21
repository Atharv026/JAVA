import java.util.Scanner;
public class reversenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=3;i>=1;i--){
            for(int j=3;j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}


/*
  enter the number
3
333
222
111
 */
