import java.util.Scanner;
public class areasquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the side");
        int side=sc.nextInt();
        double area=side*side;
        System.out.println("area of square");
        System.out.println(area);

    }
    
}

/*
 * enter the side
6
area of square
36.0
 */
