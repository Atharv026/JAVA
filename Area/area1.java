import  java.util.Scanner;
public class area1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        System.out.println("enter the breadth");
        int breadth=sc.nextInt();
        double area=length*breadth;
        System.out.println("area");
        System.out.println(area);
    }
    
}

/*enter the length
24
enter the breadth
25
area
600.0 */
