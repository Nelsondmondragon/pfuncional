package com.platzi.funcional.function;

import java.sql.SQLOutput;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombreUtils.getList("java", "functional");
        cursos.forEach(curso -> System.out.println(curso));

        BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;

        usarZero(() -> 2);

        usarPredicado(text -> text.isEmpty());

        usarBifucntion((x, y) -> x * y);

        usarBifucntion((x, y) -> {
            System.out.println("X: " + x + ",  Y: " + y);
            return x - y;
        });

        usarNada(() -> {
            System.out.println("Hola Alumno");
        });
    }

    static void usarZero(ZeroArgumentos zeroArgumentos) {

    }

    static void usarPredicado(Predicate<String> predicado) {
    }

    static void usarBifucntion(BiFunction<Integer, Integer, Integer> operacion) {
    }

    static void usarNada(OperarNada operarNada) {

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada {
        void nada();
    }
}
