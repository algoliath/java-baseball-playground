package baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// define a wrapper class for Ball's input
public class BallNumber {

    private int number;

    public BallNumber(int number) {
        if (number < 0 || number >= 10)
            throw new IllegalArgumentException("볼 넘버는 1과 9사이의 숫자여야 합니다");
        // do not omit this line!!!
        this.number = number;
    }

    int get() {
        return number;
    }

    // static methods
    public static List<BallNumber> getBallNumbers(List<Integer> numList){
        List<BallNumber> ballNumList = new ArrayList<>();
        for(int num: numList){
            ballNumList.add(new BallNumber(num));
        }
        return ballNumList;
    }

    public static List<Integer> generateBallNumbers(List<BallNumber> com, int strike, int ball){
        // invariant: strike and ball should sum up to 3
        List<Integer> generated = new ArrayList<>();
        // generate strike
        int from = 0;
        while(strike>=1){
            generated.add(com.get(from++).get());
            strike--;
        }
        int start = from;
        // generate ball
        while(ball>=1&&from<com.size()-1){
            generated.add(com.get(++from).get());
            ball--;
        }
        // generate last ball in 3-ball cases
        if(ball==1) {
            generated.add(com.get(start).get());
            from++;
        }
        // generate nothing
        while(from<com.size()){
            generated.add(10);
            from++;
        }
        return generated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
