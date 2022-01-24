package study.baseballGameTest;

import baseballGame.Ball;
import baseballGame.BallNumber;
import baseballGame.BallStatus;
import baseballGame.Balls;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// comparing digit to number
class Balls2BallTest
{

    Balls com;
    List<BallNumber> answer = BallNumber.getBallNumbers(Arrays.asList(1, 5, 6));

    // invariants: 1 <= position <= 3
    @BeforeEach
    void setUp() {
        com = new Balls(answer);
    }

    @Test
    void strike() {
        Ball sample = new Ball(1, 1);
        assertThat(com.play2Ball(sample)).isEqualTo(BallStatus.Strike);
    }

    @Test
    void ball() {
        Ball sample = new Ball(1, 2);
        assertThat(com.play2Ball(sample)).isEqualTo(BallStatus.Ball);
    }

    @Test
    void nothing() {
        Ball sample = new Ball(2, 3);
        assertThat(com.play2Ball(sample)).isEqualTo(BallStatus.Nothing);
    }

}
