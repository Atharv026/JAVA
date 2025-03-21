import java.util.Scanner;
public class patternnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the pattern number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
}


/*enter the pattern number
3
1 1 1 
2 2 2 
3 3 3 */
