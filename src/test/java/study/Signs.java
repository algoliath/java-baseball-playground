package study;

public enum Signs {
    Add, Subtract, Multiply, Divide, Nothing;
    public static Signs getSign(char operator){
        switch(operator){
            case '+': return Add;
            case '-': return Subtract;
            case '*': return Multiply;
            case '/': return Divide;
        }
        return Nothing;
    }
    public static boolean isOperator(char operator){
        Signs sign = getSign(operator);
        return sign == Add || sign == Subtract || sign == Multiply || sign == Divide;
    }
}
