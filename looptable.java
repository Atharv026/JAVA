import java.util.Scanner;
public class looptable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i*num);


        }
    }
    
}

/*
 enter the number
2
2
4
6
8
10
12
14
16
18
20
 */
