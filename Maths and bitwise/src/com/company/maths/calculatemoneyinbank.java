package com.company.maths;
//https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class calculatemoneyinbank {
    public static void main(String[] args) {
        int n=20;
        int ans=(n/7)*28+((n/7-1)*(n/7)/2)*7+((n%7)*(n%7+1)/2)+(n%7)*(n/7);
        System.out.println(ans);
    }
}