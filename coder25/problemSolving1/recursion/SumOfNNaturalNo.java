package coder25.problemSolving1.recursion;

public class SumOfNNaturalNo {
    public static void main(String[] args) {
        System.out.println(findSumOfNNum(20));
    }

    private static int findSumOfNNum(int num) {
        if(num==0||num==1){
            return num;
        }
        return num+findSumOfNNum(num-1);
    }
}
