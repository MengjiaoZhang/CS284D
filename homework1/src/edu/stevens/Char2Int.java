package edu.stevens;

public class Char2Int {
    public int char2int(char a) {
        return  Character.getNumericValue(a);
    }

    public static void main(String[] args) {
        Char2Int charint = new Char2Int();
        System.out.println(charint.char2int('3'));
    }
}
