package coder25.problemSolving1.beginnner;

import java.util.stream.IntStream;

public class PrimeRecursion {
    public static void main(String[] args) {
        IntStream.range(1,50).forEach(a-> System.out.println(new PrimeRecursion().isPrime(a,1)));

    }

    public String isPrime(int n,int i){
        if(n<=2){
            return n==2? n+" is  a prime no":n+"  is not a prime no";
        }
        if(n%i==0){
            return n+ "is not aprime no";
        }
        if(i*i>n){
            return n+" is aprime no";
        }
        return isPrime(n,i+1);
    }
}
