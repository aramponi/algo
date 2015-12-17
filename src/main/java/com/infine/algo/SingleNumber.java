package com.infine.algo;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

    }


    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(singleNumber(new int[] {1,2,3,4,5,6,7,8,9,1,2,3,5,6,7,8,9}) + "=4");
        System.out.println(System.nanoTime() - start);
    }
}
