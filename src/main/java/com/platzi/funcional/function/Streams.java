package com.platzi.funcional.function;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombreUtils.getList("Java",
                "Frontend",
                "Backend",
                "Fullstack");

        for (String course : courseList) {
            String newCourse = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + newCourse);
        }

        Stream<String> coursesStream = Stream.of("Java",
                "Frontend",
                "Backend",
                "Fullstack");
        Stream<String> coursesStream2 = Stream.of("Java", "d",
                "Frontend",
                "Backend",
                "Fullstack");

        Stream<Integer> courseLengthStream = coursesStream2.map(course -> {
            System.out.println(course.length());
            return course.length();
        });
//
        Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

        System.out.println(longest);

        Stream<String> emphasisCourse = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourse.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);

        Stream<String> courseStream3 = courseList.stream();

//        courseStream3.map(course -> course + "!!")
//                .filter(course -> course.contains("Java"))
//                .forEach(System.out::println);

        addOperator(
                courseStream3.map(course -> course + "!!")
                        .filter(course -> course.contains("Java"))
        ).forEach(System.out::println);



    }

    static <T> Stream<T> addOperator(Stream<T> stream) {
        return stream.peek(data -> System.out.println("dato" + data));
    }
}
