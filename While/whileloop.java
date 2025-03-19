import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        while(start<=end){
            System.out.println(start);
            start++;
        }
    }
    
}


/*enter the number
1
enter the number
10
1
2
3
4
5
6
7
8
9
10 */
