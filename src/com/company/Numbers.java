package com.company;

public class Numbers {
    private double real;
    private double imaginary;

    public Numbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return String.format("%s + %si", this.real, this.imaginary);
    }

    public Numbers add(Numbers secondNum) {
        Numbers result = new Numbers(real, imaginary);
        result.real = real + secondNum.real;
        result.imaginary = imaginary + secondNum.imaginary;
        return result;
    }

    public Numbers extract(Numbers secondNum) {
        Numbers result = new Numbers(real, imaginary);
        result.real = real - secondNum.real;
        result.imaginary = imaginary - secondNum.imaginary;
        return result;
    }

    public Numbers multiplication(Numbers secondNum) {
        Numbers result = new Numbers(real, imaginary);
        result.real = (real * secondNum.real) - (imaginary * secondNum.imaginary);
        result.imaginary = (imaginary * secondNum.real) + (real * secondNum.imaginary);
        return result;
    }

    public Numbers division(Numbers secondNum) {
        Numbers result = new Numbers(real, imaginary);
        result.real = ((real * secondNum.real) + (imaginary * secondNum.imaginary)) / ((Math.pow(secondNum.real, 2)) + (Math.pow(secondNum.imaginary, 2)));
        result.imaginary = ((imaginary * secondNum.real) - (real * secondNum.imaginary)) / ((Math.pow(secondNum.real, 2)) + (Math.pow(secondNum.imaginary, 2)));
        return result;
    }

    public String comparison(Numbers secondNum) {
        String compare="";
        double length1=0;
        double length2=0;

        length1=Math.sqrt((Math.pow(real, 2))+(Math.pow(imaginary, 2)));
        length2=Math.sqrt((Math.pow(secondNum.real, 2))+(Math.pow(secondNum.imaginary, 2)));

        if(length1>length2){
            compare ="Первое число больше";
        }
        else if(length1<length2){
            compare ="Второе число больше";
        }
        else {
            compare ="Числа равны";
        }

        return compare;
    }
}
