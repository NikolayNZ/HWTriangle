package com.gmail.striangle;

public class Main {
    public static void main(String[] args) {
    /*Описать класс «Triangle». В качестве свойств возьмите длины сторон
треугольника. Реализуйте метод, который будет возвращать площадь этого
треугольника. Создайте несколько объектов этого класса и протестируйте их.*/
        Triangle triangle1 = new Triangle(3.1, 3.2, 3.2);
        Triangle triangle2 = new Triangle(10.2, 10.4, 10.3);


        System.out.println(triangle1);
        System.out.println("Площадь треугольника: " + String.format("%.2f", triangle1.squareTriangle()));
        System.out.println(triangle2);
        System.out.println("Площадь треугольника: " + String.format("%.2f", triangle2.squareTriangle()));
    }
}
