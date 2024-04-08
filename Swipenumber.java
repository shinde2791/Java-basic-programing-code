public class Swipenumber {
    public static void main(String args []){
        // swipe two number using third variable
        int a = 5;
        int b=6;
        int c;
        
        System.out.println("Before swiping the value of a " +a);
        System.out.println("Before swiping the value of b " + b);
        
        c=a;
        a=b;
        b=c;
        
        System.out.println("After swiping the value of a " + a);
        System.out.println("After swiping the value of a " + b);

        // swipe two number without using third variable
        
        int a = 5;
        int b= 6;

        System.out.println("Before swiping the value of a " +a);
        System.out.println("Before swiping the value of b " + b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swiping the value of a " + a);
        System.out.println("After swiping the value of a " + b);
    }
    
}
