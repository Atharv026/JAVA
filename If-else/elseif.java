import java.util.Scanner;
public class elseif {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark of marathi");
        int marathi =sc.nextInt();
        System.out.println("enter the mark of english");
        int english=sc.nextInt();
        System.out.println("enter the mark of hindi");
        int hindi=sc.nextInt();
        System.out.println("enter the mark of math");
        int math=sc.nextInt();
        System.out.println("enter the mark of java");
        int java=sc.nextInt();
     double total=marathi+english+hindi+math+java;
     double p=total/5;
     System.out.println(total);
     System.out.println(p);
     if(p>=90 && p<=100){
System.out.println("Student got O  grade");
     }
     else if(p>=80 && p<=90){
        System.out.println("Student got A+ grade");
     }
     else if(p>=70 && p<=80){
        System.out.println("Student got A grade");
     }
     else if(p>=60 && p<=70){
        System.out.println("Student got B+ grade");
     }
     else if(p>=50 && p<=60){
        System.out.println("Student got B grade");
     }
     else if(p>=40 && p<=50){
        System.out.println("Student got c+ grade");
     }
     else if(p>=30 && p<=40){
        System.out.println("Student got C grade");
     }
     else{
        System.out.println("Student got P grade");
     }
}
    
}



/*enter the mark of marathi
84
enter the mark of english
89
enter the mark of hindi
90
enter the mark of math
87
enter the mark of java
88
438.0
87.6
Student got A+ grade */