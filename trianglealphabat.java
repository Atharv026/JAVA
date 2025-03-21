import java.util.Scanner;
public class trianglealphabat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        char ch=sc.next().charAt(0);
        for(char i='A';i<='C';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}

/*enter the number
3
A 
A B 
A B C  */
