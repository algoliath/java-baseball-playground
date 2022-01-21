package study.baseballGameTest;

import baseballGame.BallNumber;
import baseballGame.Balls;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// comparing number to number
class Balls2BallsTest
{

    Balls com;
    List<BallNumber> answer = BallNumber.getBallNumbers(Arrays.asList(1, 2, 3));

    @BeforeEach
    void setUp() {
        com = new Balls(answer);
    }

    @Test
    void strike3() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 3, 0);
        assertThat(com.playGame(player)).isEqualTo("3 strike 0 ball");
    }

    @Test
    void ball3() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 0, 3);
        assertThat(com.playGame(player)).isEqualTo("0 strike 3 ball");
    }

    @Test
    void strike2() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 2, 0);
        assertThat(com.playGame(player)).isEqualTo("2 strike 0 ball");
    }

    @Test
    void ball2() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 0, 2);
        assertThat(com.playGame(player)).isEqualTo("0 strike 2 ball");
    }

    @Test
    void ball1() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 0, 1);
        assertThat(com.playGame(player)).isEqualTo("0 strike 1 ball");
    }

    @Test
    void strike1_ball2() {
        List<Integer> player = BallNumber.generateBallNumbers(answer, 1, 2);
        assertThat(com.playGame(player)).isEqualTo("1 strike 2 ball");
    }
}
