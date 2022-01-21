package calculator;

public class Calculator {
    // requirements: priority of operations, ignore blanks
    public int eval(String expression){
        char[] ch = expression.toCharArray();
        int accForLow=0, accForHigh=0, num=0;
        char lastSign = '+';
        for(int i=0; i<ch.length; i++){
            char letter = ch[i];
            if('0'<=letter&&letter<='9'){
                num*=10;
                num+=(letter-'0');
            }
            // letter and lastSign not interchangeable
            if(i==ch.length-1|| Signs.isOperator(letter)){
                switch(Signs.getSign(lastSign)) {
                    case Add:
                        accForLow += accForHigh;
                        accForHigh = num;
                        break;
                    case Subtract:
                        accForLow += accForHigh;
                        accForHigh = -num;
                        break;
                    case Multiply:
                        accForHigh *= num;
                        break;
                    case Divide:
                        accForHigh /= num;
                        break;
                }
                lastSign = letter;
                num = 0; // initialization error
            }
        }
        return accForLow+accForHigh;
    }
}

