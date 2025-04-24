package coder25.problemSolving1.bitManipulation;

public class BitManipulation {
    public static void main(String[] args) {
        int arr[]={4,4,4,4,3,3,3,2,2,2,2};
        int result=0;
        for(int x:arr){
            result^=x;
        }
        System.out.println(result+" this works");
    }
}
