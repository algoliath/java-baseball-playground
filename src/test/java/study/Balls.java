package study;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    List<Ball> balls;

    public Balls(List<BallNumber> ballNumbers) {
        balls = new ArrayList<>();
        for(int i=1; i<=3; i++){
            balls.add(new Ball(ballNumbers.get(i-1).get(), i));
        }
    }

    // return the play result for each ball
    protected BallStatus playBall(Ball player) {
        return balls.stream()
                .map((answer) -> answer.play(player))
                .filter(BallStatus::falseIfNothing)
                .findFirst()
                .orElse(BallStatus.Nothing);
    }

    // return the play result for the whole game
    protected String playGame(List<Integer> playerList) {
        int[] bucket = new int[11]; // 0 ~ 10, 10 = null
        int matchNo = 0;
        int matchAll = 0;
        for(int num: playerList){
            bucket[num]++;
        }
        for(int i=0; i<balls.size(); i++){
            Ball comBall = balls.get(i);
            int playerBallNo = playerList.get(i);
            matchNo += Math.min(1,comBall.getBallNoIfMatch(playerBallNo));
            matchAll += Math.min(1,bucket[comBall.getBallNo()]--);
        }
        PlayResult playResult = new PlayResult(matchNo, matchAll-matchNo);
        return playResult.report();
    }
}
