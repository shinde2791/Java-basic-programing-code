import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Entry two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("what you have to do 1-Addition,2-substraction,3-multiply,4-divison,5-moduler");
        int choice=sc.nextInt();
        if (choice==1){
            System.out.println(a+b);
        }else if (choice==2){
            System.out.println(a-b);
        }else if (choice==3){
            System.out.println(a*b);
        }else if (choice==4){
            System.out.println(a/b);
        }else if (choice==5){
            System.out.println(a%b);
        }else {
            System.out.println("wrong choice");
        }
     }
}
