package com.platzi.funcional.function;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola");
        stringBuilder.append("nelson");
        stringBuilder.append(",");
        stringBuilder.append("que mas?");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }

    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
