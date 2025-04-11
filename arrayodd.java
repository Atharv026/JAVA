import java.util.Scanner;
public class arrayodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]+"");
            }
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
25
enter the element
27
21
23
25
27 */
