package edu.stevens;

public class JavaBasics {
    public static void main(String[] args) {
        // VARIABLES
        /*
        Naming convention: https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
        Start with a lowercase word, then additional words are capitalized
        ex. myFirstVariable
         */
//        String name = "Mengjiao"; // double quotation marks
//        char testGrade = 'A'; // single quotation marks
//        double gpa = 4.0;
//
//        System.out.println("My name is " + name);
//        System.out.printf("My name is %s \n", name);
//        System.out.printf("Test gpa is %.4f \n", gpa);

        /*
        %f -> double or float
        %d -> integer
        %s -> string
        %c -> character
        %b -> boolean
         */

//        // CASTING & CONVERTING
//        System.out.println( (int)3.14 );
//        System.out.println( (double)3 );
//
//        int intFromString = Integer.parseInt("20");
//        double doubleFromString = Double.parseDouble("20.99");
//
//        System.out.println(100 + intFromString);
//        System.out.println(100 + doubleFromString);

        // STRINGS

//        String greeting = "Hello";
//        //     indexes:    01234
//
//        System.out.println( greeting.length() );
//        System.out.println( greeting.charAt(1) );
//        System.out.println( greeting.indexOf("llo") );
//        System.out.println( greeting.indexOf("z") );
//        System.out.println( greeting.substring(2) );
//        System.out.println( greeting.substring(1,3) );


        // NUMBERS
//        System.out.println( 2 * 3 ); // Basic Arithmetic: +, -, /, *
//        System.out.println( 10 % 3 ); // Modulus Op. returns remainder
//        System.out.println( 1 + 2 * 3 ); // order of operations
//        System.out.println( 10 / 3.0 ); // int's and doubles
//
//        int num = 100;
//        num += 100; // same as num = num + 100 +=, -=, /=, *=
//        System.out.println(num);
//
//        num++; // num = num + 1
//        System.out.println(num);

        // Math class has useful math methods
        System.out.println( Math.pow(2, 3) );
        System.out.println( Math.sqrt(144) );
        System.out.println( Math.round(2.7) );

       // ARRAYS
////        int[] exampleNumbers = new int[6];
//        int[] exampleNumbers = {1, 3, 5, 7, 10, 20};
//        //           indexes:   0  1  2  3   4   5
//        exampleNumbers[0] = 100;
//        System.out.println(exampleNumbers[0]);
//        System.out.println(exampleNumbers[1]);
//        System.out.println(exampleNumbers.length);

        // IF STATEMENTS
//        boolean condition1 = true;
//        boolean condition2 = true;
//        if ( condition1 && condition2) {
//            System.out.println("both condition1 and condition2 are true");
//        } else if (condition1 && !condition2) {
//            System.out.println("condition1 is true and condition2 is false");
//        } else if (!condition1 && condition2) {
//            System.out.println("condition1 is false and condition2 is true");
//        } else {
//            System.out.println("both condition1 and condition2 are false");
//        }

//        // >, <, >=, <=, !=, ==, String.equals()
//        if(1 < 3) {
//            System.out.println("number comparison was true");
//        }
//
//        if('b' > 'a') {
//            System.out.println("character comparison was true");
//        }
//
//        if("dog".equals("cat")) {
//            System.out.println("string comparison was true");
//        }

// //        WHILE LOOPS

//        int index = 6;
//        while (index <= 5) {
//            System.out.println(index);
//            index++;
//        }

//        int index = 6;
//        do {
//            System.out.println(index);
//            index++;
//        } while (index <= 5);

//        // FOR LOOPS
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        for(; ;) {
//            if (i < 5) {
//                System.out.println(i);
//                i++;
//            } else {
//                break;
//            }
//        }
//
//        int myNumbers[] = {1, 3, 5, 7, 9};
//        for (int num : myNumbers) {
//            System.out.println(num);
//        }

//        // EXCEPTION CATCHING
//        try {
//            int division = 10/0;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        throw new ArithmeticException("can't add numbers");

    }
}
