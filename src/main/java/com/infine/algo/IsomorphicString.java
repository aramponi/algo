package com.infine.algo;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {

    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", null) + "=false");
        System.out.println(isIsomorphic(null, "add") + "=false");
        System.out.println(isIsomorphic("eg", "add") + "=false");
        System.out.println(isIsomorphic("egg", "add") + "=true");
        System.out.println(isIsomorphic("egg", "bar") + "=false");
        System.out.println(isIsomorphic("paper", "title") + "=true");
        System.out.println(isIsomorphic("ab", "aa") + "=false");

    }
}
