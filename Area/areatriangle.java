import java.util.Scanner;
public class areatriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length ");
        int l=sc.nextInt();
        System.out.println("enter the breadth");
        int b=sc.nextInt();
        System.out.println("enter the heigth");
        int h=sc.nextInt();
        double area=l*b*h;
        System.out.println(area);
    }
    
}

/*enter the length 
32
enter the breadth
24
enter the heigth
5
3840.0 */
