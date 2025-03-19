import java.util.Scanner;
public class whileloopevencount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int count=0;
        while(start<=end){
            if(start%2==0){
                count++;
                
            }
            start++;
        }
        System.out.println("count:"+count);
    } 
    
}

/*enter the number
1
enter the number
10
count:5 */






