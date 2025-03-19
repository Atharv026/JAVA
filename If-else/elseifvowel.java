import java.util.Scanner;
public class elseifvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the char");
        char ch=sc.next().charAt(0);
        if(ch=='a'){
            System.out.println("it  is a vowel");
        }
        else if(ch=='e'){
            System.out.println("it is a vowel");

        }
        else if(ch=='i'){
            System.out.println("it is a vowel");
        }
        else if(ch=='o'){
            System.out.println("it is a vowel");
        }
        else if(ch=='u'){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is not a vowel");
        }
    }
    
}


/*enter the char
i
it is a vowel */


/* enter the char
p
it is not a vowel*/