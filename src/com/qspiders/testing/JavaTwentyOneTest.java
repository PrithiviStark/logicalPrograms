package com.qspiders.testing;

record Player(String name, int age, int score) {};


public class JavaTwentyOneTest {
    public static void main(String[] args) {
        // write a calculator program
        double num1 = 10.5;
        double num2 = 0;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
        // write a text block code for json
        String jsonTextBlock = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "address": {
                        "street": "123 Main St",
                        "city": "New York",
                        "state": "NY"
                    },
                    "hobbies": ["reading", "painting", "cooking"]
                }
                """;
        
        System.out.println(jsonTextBlock);
        Object o=new Player("prithivi",21,201);
        String s = (o instanceof Player p) ? p.toString(): "nothing";
        System.out.println(s);
    }
}