package validator;

import domain.Calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorValidatorImpl implements CalculatorValidator {

    @Override
    public List<String> validate(Object  object ) {
        List<String> errors = new ArrayList<String>();

        Calculator calculator = (Calculator) object;
        Integer number1 = calculator.getNumber1();
        if (number1 == null) {
            errors.add("Number1 must have a number");
        }
        Integer number2 = calculator.getNumber2();
        if (number2 == null) {
            errors.add("Number1 must have a number");
        }
        String operation = calculator.getOperation();

        if("+".equals(operation) || "-".equals(operation) || "*".equals(operation) || "/".equals(operation))
            ;
        else
            errors.add("Operator is not valid");
        return errors;
    }
}
