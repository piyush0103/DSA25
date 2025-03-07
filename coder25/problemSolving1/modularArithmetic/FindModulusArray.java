package coder25.problemSolving1.modularArithmetic;

public class FindModulusArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4};
        int count=arr.length;
        int n=count;
        int result=0;

        for(int i=0;i<count;i++){
            result= (int) (result%4+(arr[i]%4*Math.pow(10,--count)%4)%4);
        }
        System.out.println(result+" array");
    }
}
