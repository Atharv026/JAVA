import java.util.Scanner;
public class loopcounteven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int Start=sc.nextInt();
        System.out.println("enter the number");
        int end=sc.nextInt();
        int count=0;
        for(int i=Start;i<=end;i++){
       if(i%2==0){
       count++;
}
 }
        System.out.println("count:"+count);

    }
    
}


/*
  enter the number
1
enter the number
30
count:15
 */
