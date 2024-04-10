public class pattern {
    public static void main(String[] args) {
//         //*
//         //**
//         //***
//         //****
//         //*****
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//         //*****
//         //****
//         //***
//         //**
//         //*

        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

// //         //*****
// //         //*   *
// //         //*   *
// //         //*****  
        
        int n=4;
        int m=5;

        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++) {
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }System.out.println();
        }

// //         //*
// //         //**
// //         //***
// //         //****

        int n=4;

        // outerloop
        for(int i=1;i<=n;i++){
            //innerloop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
// //         //****
// //         //***
// //         //**
// //         //*
        int n=4;

        // outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

// //         //   *
// //         //  **
// //         // ***
// //         //****
        int n=4;
// //         // //outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
// //         //     //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

// //         //1
// //         //1 2
// //         //1 2 3 
// //         //1 2 3 4 
// //         //1 2 3 4 5

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

// //         //12345
// //         //1234
// //         //123
// //         //12
// //         //1


        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

// //         //1
// //         //2 3 
// //         //4 5 6
// //         //7 8 9 10
// //         // 11 12 13 14 15

        int n=5;
        int number=1;
// //         // //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

// //         //1
// //         //0 1
// //         //1 0 1
// //         //0 1 0 1
// //         //1 0 1 0 1
     
        int n=5;
        // outer loop
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
            int sum=i+j;
            if(sum %2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
           
        }
        System.out.println();
        }
    }
    }
    

