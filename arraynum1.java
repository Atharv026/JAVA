import java.util.Scanner;
public class arraynum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element");
            arr[i]=sc.nextInt();
        }
        
           for(int j=0;j<=size;j++){
          System.out.println(arr[j]+" ");
                

            
            
            
        }
    }

}



/*enter the size
5
enter the element
21
enter the element
22
enter the element
23
enter the element
24
enter the element
25
21 
22
23 
24
25 */

