import java.util.Scanner;
public class loopoddsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                sum+=i;
                System.out.println(i);

            }
        }
        System.out.println(sum);
    }
    
}


/*
 1
3 
5 
7 
9 
25
 */
