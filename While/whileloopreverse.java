import java.util.Scanner;
public class whileloopreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int Start =sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        while(end>=Start){
    
            System.out.println(end);
            end--;
        }
    }
    
}


/*enter the number
1
enter the number
10
10
9
8
7
6
5
4
3
2
1 */


/*enter the number
1
enter the number
20
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1 */
