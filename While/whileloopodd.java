import java.util.Scanner;
public class whileloopodd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int start=sc.nextInt();
    System.out.println("enter the number");
    int end=sc.nextInt();
    while(start<=end){
        if(start%2!=0){
            System.out.println(start);
        }
        start++;
    }
    }
    
}

/*enter the number
1
enter the number
10
1
3
5
7
9 */
