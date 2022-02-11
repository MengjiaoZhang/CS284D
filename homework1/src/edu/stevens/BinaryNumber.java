package edu.stevens;

import java.util.Arrays;

/*
BinaryNumber
Attributes:
    private int data[]
    private int length
Constructors:
    public BinaryNumber(int length)
    public BinaryNumber(String str)
Methods:
    public int getLength()
    public int getDigit(int index)
    public int[] getInnerArray()
    public static int[] bwor(BinaryNumber bn1, BinaryNumber bn2)
    public static int[] bwand(BinaryNumber bn1, BinaryNumber bn2)
    public void bitShift(int direction, int amount)
    public void add(BinaryNumber aBinaryNumber)
    public String toString()
    public int toDecimal()
 */
public class BinaryNumber {
    private int[] data;
    private int length;

    public  BinaryNumber(int length) {
       if(length >= 0) {
           this.data = new int[length];
           this.length = length;
       }
       else {
           throw new IllegalArgumentException("the input should be non-negative");
//           throw new NegativeArraySizeException("the array size should be non-negative");
//           throw new Exception("the input should be non-negative");
//           throw new IllegalAccessException("the input should be non-negative");
//           throw new RuntimeException("the input should be non-negative");
//           System.out.println("invalid argument of length");
       }
    }

    public BinaryNumber(String str) {
//        "100011"->[1, 0, 0, 0, 1, 1]
        this.length = str.length();
        int[] tempArray = new int[this.length]; //[0, 0, 0 ,0 ,0, 0] '0'
        for(int i=0; i < this.length; i++) {
//          "0" -> 0
            tempArray[i] = Character.getNumericValue(str.charAt(i));
        }
        this.data = tempArray;
    }

    public int getLength() {
        return this.length;
    }

    public int getDigit(int index) {
//      [1, 0, 0, 0, 1, 1] valid index range:[0, 5]
        try {
            return this.data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("the index is out of bound");
            return -1;
        }
    }

    public int[] getInnerArray() {
        return  this.data;
    }

    public static int[] bwand(BinaryNumber bn1, BinaryNumber bn2) {
        if (bn1.getLength() != bn2.getLength()) {
            System.out.println("length mismatch");
            return new int[0];
        }
        int[] result = new int[bn1.getLength()];
//        1 && 1 = 1; 1 && 0 = 0; 0 && 1 = 0; 0 && 0 = 0
        for (int i = 0; i < bn1.length; i++) {
            result[i] = ((bn1.getDigit(i)==1) && (bn2.getDigit(i)==1)) ? 1 : 0;
        }
//        for (int i = 0; i < bn1.length; i++) {
//            if ((bn1.getDigit(i)==1) && (bn2.getDigit(i)==1)) {
//                result[i] = 1;
//            } else {
//                result[i] = 0;
//            }
//        }
        return  result;
    }

    public static int[] bwor(BinaryNumber bn1, BinaryNumber bn2) {
        if (bn1.getLength() != bn2.getLength()) {
            System.out.println("length mismatch");
            return new int[0];
        }
        int[] result = new int[bn1.getLength()];
//        1 || 1 = 1; 1 || 0 = 1; 0 || 1 = 1; 0 || 0 = 0
        for (int i = 0; i < bn1.length; i++) {
            result[i] = ((bn1.getDigit(i)==1) || (bn2.getDigit(i)==1)) ? 1 : 0;
        }
        return  result;
    }

    private void prepend(int amount){
//      amount: 3
//      100-> 000100
//index:012-> 012345
        int[] tempArray = new int[this.length + amount]; // 000000
        for (int i=0; i < length; i++) {
            tempArray[i+amount] = this.data[i];
        }
        this.data = tempArray;
        this.length += amount;
    }

    public void add(BinaryNumber aBinaryNumber) {
        if (this.length > aBinaryNumber.getLength()) {
//            aBinaryNumber.prepend(this.length - aBinaryNumber.getLength());
//            BinaryNumber temp_data = new BinaryNumber(aBinaryNumber.toString());
//            BinaryNumber temp_data = aBinaryNumber;
            BinaryNumber temp_data = (BinaryNumber) aBinaryNumber.clone();
            temp_data.prepend(this.length - temp_data.getLength());
            aBinaryNumber = temp_data;
        } else if (aBinaryNumber.getLength() > this.length) {
            this.prepend(aBinaryNumber.getLength() - this.length);
        }

//       100011      100011
//       100100      000100
//       1000111      100111
        int carry = 0;
        int[] result = new int[this.length];
        for (int i = this.length-1; i >= 0; i--) {
            int sum_two_digit = carry + this.getDigit(i) + aBinaryNumber.getDigit(i);
            if (sum_two_digit == 3) {
                result[i] = 1;
                carry = 1;
            } else if (sum_two_digit == 2) {
                result[i] = 0;
                carry = 1;
            } else if (sum_two_digit == 1) {
                result[i] = 1;
                carry = 0;
            } else if (sum_two_digit == 0) {
                result[i] = 0;
                carry = 0;
            }
        }
        this.data = result;
        if (carry == 1) {
            this.prepend(1);
            this.data[0] = 1;
        }
    }

    public void bitShift(int direction, int amount) {
        if (amount < 0) {
            System.out.println("invalid value for amount");
        } else if (direction == -1) {
//          100011 leftshift 2
//          10001100
            int[] tempArray = new int[this.length + amount];
            for (int i = 0; i < this.length; i++) {
                tempArray[i] = this.data[i];
            }
            this.data = tempArray;
            this.length = this.length + amount;
        } else if (direction == 1) {
//          100011 right shift 2
//            1000
            if(this.length <= amount){
                amount = this.length;
            }
            int [] tempArray = new  int[this.length - amount];
            for (int i=0; i < this.length - amount; i++) {
                tempArray[i] = this.data[i];
            }
            this.data = tempArray;
            this.length = this.length - amount;
        } else {
            System.out.println("invalid direction value");
        }
    }

    public String toString() {
        String numberString = "";
        for (int digit : this.data) {
            numberString += String.valueOf(digit); // '' 0 '0' 0 '00'
        }
        return numberString;
    }

    public int toDecimal() {
//        100011: length = 6
//  index:012345
//  power:543210
        int decimalValue = 0;
        for (int i = 0; i < this.length; i++) {
            decimalValue += (this.data[i] * (Math.pow(2.0, this.length-i-1)));
        }
        return decimalValue;
    }

    public BinaryNumber clone() {
        return new BinaryNumber(this.toString());
    }

    public static void main(String[] args) {
//        BinaryNumber bn1 = new BinaryNumber(-5);
        BinaryNumber bn1 = new BinaryNumber("100011");
        BinaryNumber bn2 = new BinaryNumber("100100");
//        BinaryNumber bn3 = new BinaryNumber("010");
//        System.out.println(bn1);
//        System.out.println(bn2);
//        System.out.println(bn1.data);
//        System.out.println(bn1.getInnerArray());
//        System.out.println(Arrays.toString(bn1.data));
//        System.out.println(Arrays.toString(bn2.data));

//        System.out.println(bn1.getDigit(100));

//        BinaryNumber bn2clone = new BinaryNumber(bn2.toString());
//        BinaryNumber bn2clone = (BinaryNumber) bn2.clone();
//        BinaryNumber bn2clone = bn2;

//        System.out.println(bn1.data);
//        System.out.println(Arrays.toString(bwand(bn1, bn2)));
//        bn1.bitShift(-1, 2);
//        bn1.bitShift(1, 2);
//        System.out.println(Arrays.toString(bn1.data));
//        System.out.println(Arrays.toString(bwor(bn1, bn2)));
        System.out.println(bn1.toDecimal());
//        System.out.println(bn2.data);
//        System.out.println(Arrays.toString(bn2.data));
//        System.out.println(bn2clone.data);
//        bn1.add(bn2);
//        System.out.println(bn1);
//        System.out.println(Arrays.toString(bn2.data));
    }
}
