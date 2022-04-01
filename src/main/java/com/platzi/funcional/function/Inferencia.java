package com.platzi.funcional.function;

import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora =
                integer -> "Al doble" + (integer * 2);
    }
}
