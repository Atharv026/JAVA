import java.util.Scanner;
public class reversepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        //int num=sc.nextInt();
        char ch=sc.next().charAt(0);
        for(char i='C';i>='A';i--){
            for(char j='C';j>='A';j--){
                System.out.print(i);
            }
            System.out.println();
        }

        }

    }


    /*
    
    enter the number
3
CCC
BBB
AAA */
    

    

