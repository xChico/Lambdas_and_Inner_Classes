public class Calculator {
    public DoMath toOperation(String op){
        DoMath value;
        switch (op) {
            case "+": value= (x1, x2) -> x1+x2;


//Use a lambda expression to set "res" to the correct function.
            break;
            case "-": value= (x1, x2) -> x1-x2;

//Use a lambda expression to set "res" to the correct function.
            break;
            case "*": value= (x1, x2) -> x1*x2;
//Use a lambda expression to set "res" to the correct function.
            break;
            case "/": value= (x1, x2) -> x2 == 0? Double.POSITIVE_INFINITY:x1/x2;

//se a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.
            break;
            default: value= (x1, x2) -> Double.MIN_VALUE;
//In the default value, the res function should return the minimun possible value.
        }
        return value;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);

//set calc to the correct function calling the method above.
        return calc.compute(n1, n2);
//return the result of calc.compute with the numbers given.
    }
}
