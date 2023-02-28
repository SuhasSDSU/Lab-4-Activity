package org.example.operations;

public class AdditionOperation implements IMathOperation{
    @Override
    public void execute(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
