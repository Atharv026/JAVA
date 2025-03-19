import java.util.Scanner;
public class whileposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int temp = num;
        int digit=0;

        while(num>0){
            digit++;
            num = num/10;
        }
        System.out.println(".Digit count =  " + digit);
        int position=1;
        if(digit%2==0){
            position = 0;
        }
        num=temp;
        int sum=0;
        while(num>0){
        
            if(position%2==0){
              sum=sum+num%10;
            }
            position++;
            num = num/10;
        }
         System.out.println("sum:"+sum);
        
    }
    
}



/*
enter the number
123456
.Digit count =  6
sum:12 */