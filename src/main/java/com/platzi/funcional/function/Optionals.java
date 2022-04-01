package com.platzi.funcional.function;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String> variable = getNames().orElseGet(() -> new LinkedList<>());
    }

    static Optional<List<String>> getNames() {
        List<String> list = new LinkedList<>();
        return Optional.of(new LinkedList<>());
    }
}
