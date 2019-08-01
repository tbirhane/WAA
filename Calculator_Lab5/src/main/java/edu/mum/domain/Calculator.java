package edu.mum.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 748392348L;
    private Integer number1;
    private Integer number2;
    private String operation;

    public Calculator() {

    }

    public Integer getNumber1() {
        return number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer calculate(){
        if(this.operation.equals("+")){
            return this.number1+this.number2;
        }
        if(this.operation.equals("-")){
            return this.number1-this.number2;
        }
        if(this.operation.equals("*")){
            return this.number1*this.number2;
        }
        if(this.operation.equals("/")){
            return this.number1/this.number2;
        }

        return null;
    }
}
