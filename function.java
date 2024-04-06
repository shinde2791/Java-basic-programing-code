//Print a given name in function

import java.util.Scanner;
public class function{

public static void PrintMyName (String name){
    System.out.println("my name is " +name);
    return;
}

public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    String name=sc.next();
    PrintMyName(name);
}
}

// Make a function to add 2 number and return the sum

import java.util.Scanner;
public class function{
    public static int CalculateSum (int a , int b){
        int sum = a+b;
        return sum;
    }
public static void main (String args []){
    Scanner sc=new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = CalculateSum(a, b);
    System.out.println("the sum of two number is "+ sum);

}
}

// Make a function to Multiply 2 Numbers and return the product

import java.util.Scanner;
public class function{
    public static int CalculateProduct(int a , int b){
        return a*b;
    }
    public static void main (String args []) {
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        int sum=CalculateProduct(a, b);
        System.out.println("product of two number is "+ CalculateProduct(a, b));
    }
}

// Find the Factorial of Number
 import java.util.Scanner;
 public class function {
    public static void PrintFactorial (int n) {
        // condition
        if(n<0){
            System.out.println("Invalid Number ");
            return;
        }
        //loops
        int Factorial = 1;
        for(int i=n;i>=1;i--){
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
        return;
        }
        //main function
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            PrintFactorial(n);
        }
 }

