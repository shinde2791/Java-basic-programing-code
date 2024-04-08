import java.util.Scanner;
public class count {
    public static void main(String args []){
    Scanner sc = new Scanner (System.in);
    // count a digit given in the sum
    int num=sc.nextInt();
    int digit=0;
    
    while(num != 0){
        num=num/10;
        digit++;
    }
    System.out.println(digit);

    // count no of digit and find the sum of digit

    int num =sc.nextInt();
    int digit = 0;
    int sum = 0;

    while(num != 0){
        sum=num+sum%10;
        num=num/10;
        digit++;
    }
     System.out.println("digit "+digit);
     System.out.println("sum "+sum);
  }
 }

    
