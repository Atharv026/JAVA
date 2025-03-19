import java.util.Scanner;
public class whilepositionodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int digit=0;
        int temp=num;
        while(num>0){
            digit++;
         num=num/10;
        }
        System.out.println("digit:"+digit);
        int position=1;
        while(num>0){
            if(digit%2!=0){
            position=0;
            }
            position++;
        }
        num=temp;
        int sum=0;
        while(num>0){
        if(position%2!=0){
          sum=sum+num%10;
}
         position++;
         num=num/10;
        }
        System.out.println("sum:"+sum);
        
    }
    
}


/*enter the number
12345
digit:5
sum:9
*/
