package study;

class Calculator {
    // requirements: priority of operations, ignore blanks
    public int eval(String expression){
        char[] ch = expression.toCharArray();
        int acc_l=0, acc_h=0;
        char lastSign='+';
        for(int i=0; i<ch.length; i++){
            int num = 0;
            if('0'<=ch[i]&&ch[i]<='9'){
                while(i<ch.length&&'0'<=ch[i]&&ch[i]<='9'){
                    num*=10;
                    num+=(ch[i]-'0');
                    i++;
                }
            }
            if(i==ch.length||ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/'){
                switch(lastSign) {
                    case '+':
                        acc_l += acc_h;
                        acc_h = num;
                        break;
                    case '-':
                        acc_l += acc_h;
                        acc_h = -num;
                        break;
                    case '*':
                        acc_h *= num;
                        break;
                    case '/':
                        acc_h /= num;
                        break;
                }
                if(i<ch.length) lastSign = ch[i];
            }
        }
        return acc_l+acc_h;
    }
}

