package study.baseballGameTest;

import baseballGame.Ball;
import baseballGame.BallStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// comparing digit to digit
class Ball2BallTest
{
    Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 3);
    }

    @Test
    void strike(){
        Ball sample = new Ball(1, 3);
        BallStatus status = com.play(sample);
        assertThat(status).isEqualTo(BallStatus.Strike);
    }

    @Test
    void ball() {
        Ball sample = new Ball(1, 4);
        BallStatus status = com.play(sample);
        assertThat(status).isEqualTo(BallStatus.Ball);
    }

    @Test
    void nothing() {
        Ball sample = new Ball(2, 3);
        BallStatus status = com.play(sample);
        assertThat(status).isEqualTo(BallStatus.Nothing);
    }
}
