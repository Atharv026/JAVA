import java.util.Scanner;
public class arrayevennum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the element");
            arr[i]=sc.nextInt();
         }
         for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");

            }
         }


    }

    
}



/*enter the size
5
enter the element
22
enter the element
24
enter the element
26
enter the element
28
enter the element
23
22 24 26 28  */
