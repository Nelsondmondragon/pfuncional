package com.platzi.funcional.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(2));


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = c -> c % 2 == 0;

        System.out.println(isEven.test(2));

        Predicate<Student> isApproved = student -> student.getCalificacion() > 6.0;

        Student student = new Student(5.9);
        System.out.println(isApproved.test(student));
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
