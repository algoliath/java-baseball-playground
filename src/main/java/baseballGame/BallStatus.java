package baseballGame;

public enum BallStatus {

    Strike, Ball, Nothing;

    public static boolean falseIfNothing(BallStatus result) {
        return result!=Nothing;
    }

}
