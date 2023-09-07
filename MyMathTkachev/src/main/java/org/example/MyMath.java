package org.example;

public class MyMath {
    public static final double E = 2.718281828459045;
    public static final double PI = 3.141592653589793;

    int firstNumber, secondNumber, pow, radius;

    double length, square, degree;

    double radian = PI * degree / 180;

    public MyMath(int firstNumber, int secondNumber, int radius, int degree) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.radius = radius;
        this.degree = degree;
    }

    double minNumber(){
        if (this.firstNumber > this.secondNumber){
            System.out.println("Первое значение больше, чем второе! " + this.firstNumber);
            return this.firstNumber;
        } else if (this.firstNumber < this.secondNumber){
            System.out.println("Второе значение больше, чем первое! " + this.secondNumber);
            return this.secondNumber;
        } else {
            System.out.println("Числа одинаковые! " + this.secondNumber);
            return this.firstNumber;
        }
    }

    void pow(){
        pow = 1;

        for (int i = 0; i < this.secondNumber; i++){
            pow = pow * this.firstNumber;
        }

        System.out.println("Ответ возведения в степень: " + pow);
    }

    void lengthCircle(){
        length = 2 * PI * radius;

        System.out.println("Длина окружности: " + length);
    }

    void squareCircle(){
        square = PI * (radius * radius);

        System.out.println("Площадь окружности: " + square);
    }

    void run(){
        minNumber();
        pow();
        lengthCircle();
        squareCircle();
    }
}
