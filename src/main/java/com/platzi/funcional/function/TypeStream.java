package com.platzi.funcional.function;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        infiniteStream.limit(1000)
//                .parallel()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        Stream<Integer> firstTenNumbersStream = Stream.iterate(0, i -> i + 1).limit(10);
        int sumOfFirstTen = firstTenNumbersStream.reduce(-100, (a, b) -> a + b);
        System.out.println(sumOfFirstTen);

        Stream<String> aLongStoryStreamAgain = Stream.of("Cuando", "despertó,", "el", "dinosaurio", "todavía", "estaba", "allí.");
        int charCount = aLongStoryStreamAgain.reduce(0, (count, word) -> {
//            System.out.println("Cound: " + count + " word: " + word);
//            System.out.println(word.length());
            return count + word.length();
        }, (a, b) -> {
            System.out.println(a);
            System.out.println(b);
            return a + b;
        });
        System.out.println(charCount);


        IntStream infiniteStream2 = IntStream.iterate(0, x -> x + 1);
        infiniteStream2.limit(1000)
//                .parallel()
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

    }
}
