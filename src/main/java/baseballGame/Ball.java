package baseballGame;

public class Ball {
    private final BallNumber ballNo;
    private final int position;

    public Ball(int ballNo, int position) {
        this.ballNo = new BallNumber(ballNo);
        this.position = position;
    }

    public BallStatus play(Ball input) {
        // prevent null pointer exception
        if(this.equals(input))
            return BallStatus.Strike;
        if(matchBallNo(input.getBallNo()))
            return BallStatus.Ball;
        return BallStatus.Nothing;
    }

    public int getBallNo(){
        return ballNo.get();
    }

    public int getBallNoIfMatch(int ballNo){
        if(this.matchBallNo(ballNo)) return ballNo;
        return 0;
    }

    public boolean matchBallNo(int ballNo) {
        return this.getBallNo() == ballNo;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Ball){
            return this.position ==((Ball)o).position && this.ballNo ==((Ball)o).ballNo;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = java.lang.Integer.hashCode(ballNo.get());
        result = 31 * result + java.lang.Integer.hashCode(position);
        return result;
    }
}
