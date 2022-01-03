package study;

import java.util.Scanner;

class InputView{
    Scanner scanner;
    InputView(){
        this.scanner = new Scanner(System.in);
    }
    int generate_number(){
        System.out.print("숫자를 입력해 주세요: ");
        return scanner.nextInt();
    }
    int generate_flag(){
        return scanner.nextInt();
    }
}

class ResultView{
    ResultView(){}
    void printResult(int s, int b){
        String res = "";
        if(b>0) {
            res += b+"볼"+" ";
        }
        if(s>0) {
            res += s+"스트라이크";
        }
        System.out.println(res);
    }
}

class BaseballGame{
    InputView inputView = new InputView();
    ResultView resultView = new ResultView();
    int target; // target number;
    int s,b;
    BaseballGame() {
        init();
    }
    void init(){
        s = 0;
        b = 0;
        target = inputView.generate_number();
    }
    void start(){
        int flag = 1;
        while(flag == 1) {
            flag = pass();
        }
    }
    int pass(){
        if(s<3){
            int num = inputView.generate_number();
            sayAndCount(num);
            resultView.printResult(s, b);
            return 1;
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        init(); // initialize
        return inputView.generate_flag();
    }
    //
    void sayAndCount(int sayNumber){
        s = match_number_and_index(sayNumber, this.target);
        b = match_number(sayNumber, this.target) - s;
    }
    //
    int match_number(int input, int tar){
        int count = 0;
        int[] bucket = new int[10];
        // check frequencies of the input number
        while(input!=0){
            bucket[input%10]++;
            input/=10;
        }
        // check frequencies of the target number
        while(tar!=0){
            count+=Math.min(bucket[tar%10]--,1);
            tar/=10;
        }
        return count;
    }
    int match_number_and_index(int input, int tar){
        int count = 0;
        while(input!=0&&tar!=0){
            // comparing last digits
            count+=isMatch(input%10, tar%10);
            input/=10;
            tar/=10;
        }
        return count;
    }
    int isMatch(int a, int b){
        if(a%10==b%10) return 1;
        return 0;
    }
}

public class BaseballGameTest {
    public static void main(String[] args){
        BaseballGame game = new BaseballGame();
        game.start();
    }
}
