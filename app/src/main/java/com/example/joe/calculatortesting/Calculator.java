package com.example.joe.calculatortesting;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public boolean isEqual(int a, int b){
       /* if(a == b){
            return true;
        }else{
            return false;
        }
        */
        return a == b;
    }
}
