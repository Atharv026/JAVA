import java.util.Scanner;
public class areacube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of cube");
        int cube=sc.nextInt();
        double area= (6 * cube *cube );
        System.out.println("area of cube");
        System.out.println(area);

    }
    
}
/*
 * enter the no of cube
5
area of cube
150.0
 */
