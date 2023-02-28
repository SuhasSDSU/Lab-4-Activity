package org.example;

import org.example.operations.IMathOperation;

public class Calculator {
    private IMathOperation operations;

    public Calculator(IMathOperation operation){
        this.operations = operation;
    }

    public void executeStrategy(int num1 , int num2){
        operations.execute(num1, num2);
    }
}
