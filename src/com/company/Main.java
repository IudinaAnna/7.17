package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static int rolldice1(){
        int dice1 = (int)(1+Math.random()*6);
        return dice1;
    }
    public static int rolldice2(){
        int dice2 = (int)(1+Math.random()*6);
        return dice2;
    }
    public  static int sum(int dice1,int dice2){
        int sum = dice1+ dice2;
        return sum;
    }
    public static void main(String[] args) {
        int [] Array = new int[36000000];
        int [] frequency = new int[13];
        for(int i=0;i<36000000;i++){
            ++frequency[sum(rolldice1(),rolldice2())];
        }
        for(int j=2;j<frequency.length;j++){
            System.out.printf("%4d%10d\n",j,frequency[j]);
        }
    }
}

