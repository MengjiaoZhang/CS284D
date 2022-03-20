package edu.stevens;

public class BigO {
    //   static int count=0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+ i);
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println("\t");
            System.out.println("end of inner for loop");
        }
//        for(int j = 0; j< 10; j++) {
//            System.out.println(j);
//        }
//        System.out.println("end of for loop");

//        int n = 10;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("Hello");
//            }
//        }
//
//
//        for(int j = 0; j< n; j++) {
//            System.out.println("Hello");
//        }
//
//
//        for(int j = 0; j < n; j++) {
//            System.out.println(j);
//        }
//
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("Hello");
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Hello");
//            }
//        }
//        int n = 128;
//        int count = 0;
//
//        for (int i = 1; i <= n; i*=2){
//            System.out.println(i);
//            count++;
//        }
//
//        System.out.println("the for loop executes " + count + " times");


//        int n = 128;
//
//        int i, j, k = 0;
//        int count = 0;
//        for (i = n/2; i>0; i--) {
//            for (j = 1; j <= n; j *=2){
//                k = k + n/2;
//                count ++;
//            }
//        }
//
//
//        System.out.println("run " + count + "times");


        int n = 100;
        for (int i=0 ; i < 10; i++) {
            System.out.println(i);
        }

    }
}


