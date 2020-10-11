package com.company;

public class Main {

    public static void main(String[] args) {
        Numbers A = new Numbers(5, 6);
        Numbers B = new Numbers(7, 4);

        Numbers complex = A.add(B);
        System.out.println(complex);

        complex = A.extract(B);
        System.out.println(complex);

        complex = A.multiplication(B);
        System.out.println(complex);

        complex = A.division(B);
        System.out.println(complex);

        System.out.println(A.comparison(B));

    }
}
