package com.company;

public class Main {

    public static int gcd1(int a, int b){
        while (b != 0) {
            int t = b;
                b = a % b;
                a = t;
        }
        return a;
    }

    public static int gcd2(int a, int b){
        while (a != b) {
            if(a > b) {
                a = a - b;

            }else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcd3(int a, int b) {
        if(b == 0){
            return a;
        }else {
            return gcd3(b, a % b);
        }
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println(gcd1(126, 54)); //18
        System.out.println(gcd2(246, 64)); //2
        System.out.println(gcd3(432, 23));

    }
}
