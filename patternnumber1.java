import java.util.Scanner;
public class patternnumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        
    }
    
}


/*enter the number
3
1 2 3 
1 2 3
1 2 3 */
