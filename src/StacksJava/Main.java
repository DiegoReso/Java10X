package StacksJava;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Hinata");
        ninjaStack.push("Kakashi");
        System.out.println(ninjaStack);
        ninjaStack.pop();
        System.out.println(ninjaStack);
        System.out.println(ninjaStack.peek());
        System.out.println("Tamanho da Stack: " + ninjaStack.size() + " elementos!");
    }
}
