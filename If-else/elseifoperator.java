import java.util.Scanner;
public class elseifoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter the number");
        int num1=sc.nextInt();
        System.out.println("enter the char");
        char ch=sc.next().charAt(0);
        if(ch=='+'){
            System.out.println(num+num1);
        }
        else if(ch=='-'){
            System.out.println(num-num1);
        }
        else if(ch=='*'){
            System.out.println(num*num1);
        }
        else if(ch=='/'){
            System.out.println(num/num1);
        }
        else{
            System.out.println("Invalid");
        }


    }
    
}


/*enter the number
89
enter the number
98
enter the char
+
187 */
