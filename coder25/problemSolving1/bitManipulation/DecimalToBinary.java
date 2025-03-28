package coder25.problemSolving1.bitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(47));
    }

    private static String convertToBinary(int num) {
    StringBuilder str= new StringBuilder();
    while(num>0){
        str.append(num%2);
        num=num/2;
    }
    return str.reverse().toString();
    }
}
