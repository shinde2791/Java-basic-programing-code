import java.util.Scanner;
  public class loops {
   public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter a table of your choice");
    int table = sc.nextInt();
      // we will print a table using - For Loop
    for (int i=1;i<=10;i++){ 
    System.out.println(table+"*"+i+"="+table*i);
  }

//      // we will print a table using - While Loop
     int i=1;
     while(i<=10){
        System.out.println(table+"*"+i+"="+table*i);
        i++;
     }
     
     // we will print a table using - Do While Loop
        int i=1;
        do{
            System.out.println(table+"*"+i+"="+table*i);
            i++;
        } while (i<=10);

 }
}

